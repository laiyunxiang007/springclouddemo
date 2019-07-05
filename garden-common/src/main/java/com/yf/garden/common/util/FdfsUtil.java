package com.yf.garden.common.util;
import org.csource.common.IniFileReader;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 张继生
 * @date 2019/4/25 16:55
 */
public class FdfsUtil {
    private static Logger logger = LoggerFactory.getLogger(FdfsUtil.class);
    private static String HTTP_URL;
    private static String conf_filename = "fdfs.properties";
    static {
        try {
            IniFileReader iniReader = new IniFileReader(conf_filename);
            HTTP_URL = iniReader.getStrValue("http.url");
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }
    public static String upload(byte[] fileByte, String extName) throws Exception {
        String fileIds[] = null;
        try {
            ClientGlobal.init(conf_filename);
            TrackerClient tracker = new TrackerClient();
            TrackerServer trackerServer = tracker.getConnection();
            StorageServer storageServer = null;
            StorageClient storageClient = new StorageClient(trackerServer, storageServer);
            fileIds = storageClient.upload_file(fileByte, extName, null);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } catch (MyException e) {
            throw e;
        }
        return fileIds[0] + "/" + fileIds[1];
    }
    public static Integer delete_file(String path){
        int result=-1;  
        try {
            String group = "group1";
            if(path == null){
                return  result;
            }
            String s = path.replace("https://trace.yufengtek.com","");
            String storagePath = path.substring(group.length()+1,s.length());
            ClientGlobal.init(conf_filename);
            TrackerClient tracker = new TrackerClient();
            TrackerServer trackerServer = tracker.getConnection();
            StorageServer storageServer = null;
            StorageClient storageClient = new StorageClient(trackerServer, storageServer);
            result = storageClient.delete_file(group, storagePath);  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (MyException e) {  
            e.printStackTrace();  
        }  
         return  result;  
    }
    public static String getBaseHttpUrl() {
        return HTTP_URL;
    }
}
