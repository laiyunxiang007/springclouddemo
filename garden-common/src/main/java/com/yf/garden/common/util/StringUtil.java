package com.yf.garden.common.util;
import com.yf.garden.common.config.FmConfig;
import org.apache.commons.codec.binary.Hex;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;

/**
 * 操作string工具
 * @author 张继生
 */
public class StringUtil {
    public static boolean isEmpty(String str) {
        return (null == str) || str.trim().length() == 0;
    }
    public static boolean isEmptySql(String str) {
        return !isEmpty(str);
    }
    public static String encryptMD5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String backMD5(String inStr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String result = "";
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update((inStr).getBytes("UTF-8"));
        byte b[] = md5.digest();

        int i;
        StringBuffer buf = new StringBuffer("");

        for(int offset=0; offset<b.length; offset++){
            i = b[offset];
            if(i<0){
                i+=256;
            }
            if(i<16){
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }
        result = buf.toString();
        return result;

    }

    public static String getPasswordComplex() {
        String password;
        while(true){
            password = getLowerLetterNumber(6);
            //必须包含字母和数字
            if (password.matches("(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}")) {
                return password;
            }
        }
    }
    /**
     * 获取随机字符串 0-9,a-z,0-9
     * 有两遍0-9，增加数字概率
     * @param length    长度
     * @return
     */
    public static String getLowerLetterNumber(int length) {
        String str = "0123456789abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; ++i) {
            sb.append(str.charAt(random.nextInt(46)));
        }
        return sb.toString();
    }

    public static String encryptBASE64(String str) {
        return new String(Base64.getEncoder().encode(str.getBytes()));
    }

    public static String generateSerialNumber(String base, int incr) {
        return base + incr;
    }

    public static String generateHmacSha1(String src, String key) {
        try {
            SecretKeySpec signingKey = new SecretKeySpec(key.getBytes("utf-8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(signingKey);
            byte[] rawHmac = mac.doFinal(src.getBytes("utf-8"));
            return Hex.encodeHexString(rawHmac);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 拼接fm设备必要参数URL
     * @param baseUrl
     * @return
     */
    public static String buildFmAuthorizedUrl(String baseUrl) {
        long timestamp = System.currentTimeMillis()/1000;
        String nonce = (timestamp + "").substring(6, 10);
        String signature = generateHmacSha1(timestamp+nonce, FmConfig.getSecret());
        String param = "encoding=utf8&client_id=" + FmConfig.getClientId() + "&timestamp=" + timestamp + "&nonce=" + nonce + "&signature=" + signature;
        if (baseUrl.indexOf("?") > 0) {
            return baseUrl + "&" + param;
        } else {
            return baseUrl + "?" + param;
        }
    }
}
