package com.yf.garden.common.error;

/**
 * 错误枚举类基类
 * 1.code=0 -- 成功编码
 * 2.code=999*** -- 系统级错误编码（以999开头，如999001）
 * @author 张继生
 */
public class BaseErrorType {

    public static final BaseErrorType SYSTEM_PARAMETER_ERROR_ERROR = new BaseErrorType("999001", "SYSTEM_PARAMETER_ERROR_ERROR", "请求参数错误");
    public static final BaseErrorType SYSTEM_REQUEST_TYPE_ERROR = new BaseErrorType("999002", "SYSTEM_REQUEST_TYPE_ERROR", "请求类型错误");
    public static final BaseErrorType SYSTEM_USER_NOT_EXIST_ERROR = new BaseErrorType("999003", "SYSTEM_USER_NOT_EXIST_ERROR", "用户不存在");
    public static final BaseErrorType SYSTEM_TICKET_VALIDATE_ERROR = new BaseErrorType("999004", "SYSTEM_TICKET_VALIDATE_ERROR", "ticket验证失败");
    public static final BaseErrorType SYSTEM_CAS_SERVER_ERROR = new BaseErrorType("999005", "SYSTEM_CAS_SERVER_ERROR", "cas服务器访问失败");
    public static final BaseErrorType SYSTEM_AUTH_KEY_ERROR = new BaseErrorType("999006", "SYSTEM_AUTH_KEY_ERROR", "获取authKey失败");
    public static final BaseErrorType SYSTEM_UNLOGIN_ERROR = new BaseErrorType("999007", "SYSTEM_UNLOGIN_ERROR", "用户未登录");
    public static final BaseErrorType SYSTEM_USER_INFO_CHANGED_ERROR = new BaseErrorType("999008", "SYSTEM_USER_INFO_CHANGED_ERROR", "用户信息改变");
    public static final BaseErrorType SYSTEM_AUTH_HEADER_ERROR = new BaseErrorType("999009", "SYSTEM_AUTH_HEADER_ERROR", "无法获取认证头部信息");
    public static final BaseErrorType SYSTEM_AUTH_TYPE_ERROR = new BaseErrorType("999010", "SYSTEM_AUTH_TYPE_ERROR", "错误的认证类型");
    public static final BaseErrorType SYSTEM_AUTH_PARAM_MISS = new BaseErrorType("999011", "SYSTEM_AUTH_PARAM_MISS", "缺少认证参数");
    public static final BaseErrorType SYSTEM_AUTH_TIME_OUT = new BaseErrorType("999012", "SYSTEM_AUTH_TIME_OUT", "签名已过期");
    public static final BaseErrorType SYSTEM_AUTH_SIGN_ILLEGAL = new BaseErrorType("999013", "SYSTEM_AUTH_SIGN_ILLEGAL", "认证签名失败");
    public static final BaseErrorType SYSTEM_PARAMETER_MISS_ERROR = new BaseErrorType("999014", "SYSTEM_PARAMETER_MISS_ERROR", "参数缺失");
    public static final BaseErrorType SYSTEM_NULLPOINT_ERROR = new BaseErrorType("999015", "SYSTEM_NULLPOINT_ERROR", "空指针异常");
    public static final BaseErrorType SYSTEM_SQL_GRAMMAR_ERROR = new BaseErrorType("999016", "SYSTEM_SQL_GRAMMAR_ERROR", "SQL语法错误");
    public static final BaseErrorType SYSTEM_WITHOUT_PRIVILEGE_ERROR = new BaseErrorType("999017", "SYSTEM_WITHOUT_PRIVILEGE_ERROR", "没有权限");
    public static final BaseErrorType SYSTEM_NOT_WORKGROUP_ADMIN_ERROR = new BaseErrorType("999018", "SYSTEM_NOT_WORKGROUP_ADMIN_ERROR", "非工作组管理员");
    public static final BaseErrorType SYSTEM_MYBATIS_ERROR = new BaseErrorType("999019", "SYSTEM_MYBATIS_ERROR", "mybatis解析错误");
    public static final BaseErrorType SYSTEM_OTHER_SERVER_REQUEST_ERROR = new BaseErrorType("999020", "SYSTEM_OTHER_SERVER_REQUEST_ERROR", "远程服务调用失败");
    public static final BaseErrorType SYSTEM_WITHOUT_SYSTEM_ERROR = new BaseErrorType("999021", "SYSTEM_WITHOUT_SYSTEM_ERROR", "该系统不存在");
    public static final BaseErrorType PARAMETER_ACCOUNT_EMPTY_ERROR = new BaseErrorType("999022", "PARAMETER_ACCOUNT_EMPTYERROR", "登录参数账号为空");
    public static final BaseErrorType PARAMETER_PASSWORD_EMPTY_ERROR = new BaseErrorType("999023", "PARAMETER_PASSWORD_EMPTY_ERROR", "登录参数密码为空");
    public static final BaseErrorType PARAMETER_MOBILE_EMPTY_ERROR = new BaseErrorType("999028", "PARAMETER_ACCOUNT_EMPTYERROR", "参数手机号为空");
    public static final BaseErrorType PARAMETER_SMSCODE_EMPTY_ERROR = new BaseErrorType("999029", "PARAMETER_SMSCODE_EMPTY_ERROR", "参数短信验证码为空");
    public static final BaseErrorType USER_NOT_FIND_ERROR = new BaseErrorType("999024", "PARAMETER_PASSWORD_EMPTY_ERROR", "登录用户不存在，请先加入我们");
    public static final BaseErrorType PARAMETER_PASSWORD_ERROR = new BaseErrorType("999025", "PARAMETER_PASSWORD_ERROR", "密码错误");
    public static final BaseErrorType PARAMETER_EMPTY_ERROR = new BaseErrorType("999026", "PARAMETER_EMPTY_ERROR", "参数为空,参数不全");
    public static final BaseErrorType GARDEN_NOT_FIND_ERROR = new BaseErrorType("999027", "GARDEN_NOT_FIND_ERROR", "果园不存在");
    public static final BaseErrorType SMSCODE_ERROR = new BaseErrorType("999030", "NOT_FIND_SMSCODE_ERROR", "短信验证码错误或已过期");
    public static final BaseErrorType ADDR_NOT_FIND_ERROR = new BaseErrorType("999031", "ADDR_NOT_FIND_ERROR", "果园地址id为空");
    public static final BaseErrorType NOT_UPLOAD_IMAGE_ERROR = new BaseErrorType("999032", "NOT_UPLOAD_IMAGE_ERROR", "还没选择图片");
    public static final BaseErrorType NOT_FIND_FARMWORK_ERROR = new BaseErrorType("999033", "NOT_FIND_FARMWORK_ERROR", "农事活动不存在");
    public static final BaseErrorType NOT_FIND_FM_ERROR = new BaseErrorType("999034", "NOT_FIND_FM_ERROR", "FM设备不存在");
    public static final BaseErrorType MOBILE_EXIST_ERROR = new BaseErrorType("999035", "MOBILE_EXIST_ERROR", "手机号用户已存在，不能重复加入我们");
    public static final BaseErrorType ORCHARD_EXIST_ERROR = new BaseErrorType("999036", "ORCHARD_EXIST_ERROR", "果园名称已存在");
    public static final BaseErrorType ORCHARD_NAME_EMPTY_ERROR = new BaseErrorType("999037", "ORCHARD_NAME_EMPTY_ERROR", "果园名称不能为空");
    public static final BaseErrorType USER_FREEZE_ERROR = new BaseErrorType("999038", "USER_FREEZE_ERROR", "用户处于冻结状态,请等果园审批通过后再登录");
    public static final BaseErrorType OWNER_EMPTY_ERROR = new BaseErrorType("999039", "OWNER_EMPTY_ERROR", "负责人为空");
    public static final BaseErrorType AREA_EMPTY_ERROR = new BaseErrorType("999040", "AREA_EMPTY_ERROR", "面积为空");
    public static final BaseErrorType SUMMARY_EMPTY_ERROR = new BaseErrorType("999041", "SUMMARY_EMPTY_ERROR", "简介为空");
    public static final BaseErrorType MODIFY_THE_FAILURE = new BaseErrorType("999045", "MODIFY_THE_FAILURE", "审核失败");
    public static final BaseErrorType TO_DEAL_WITH_FAILURE = new BaseErrorType("999046", "TO_DEAL_WITH_FAILURE", "处理失败");
    public static final BaseErrorType ADD_FAILURE = new BaseErrorType("999047", "ADD_FAILURE", "新增失败");
    public static final BaseErrorType OPEN_ID_EMPTY_ERROR = new BaseErrorType("999042", "OPEN_ID_EMPTY_ERROR", "微信号为空");
    public static final BaseErrorType WECHAT_OPENID_NOT_FIND_ERROR = new BaseErrorType("999043", "WECHAT_OPENID_NOT_FIND_ERROR", "微信openId不存在,请先加入我们");
    public static final BaseErrorType MOBILE_EXIST_ERROR_PC = new BaseErrorType("999048", "MOBILE_EXIST_ERROR_PC", "手机号已存在，不能重复加入");
    public static final BaseErrorType USER_NOT_FIND_ERROR_PC = new BaseErrorType("999049", "PARAMETER_PASSWORD_EMPTY_ERROR", "请输入正确的手机号");
    public static final BaseErrorType PARAMETER_PASSWORD_ERROR_PC = new BaseErrorType("999050", "PARAMETER_PASSWORD_ERROR", "请输入正确的密码");
    public static final BaseErrorType CELL_PHONE_NUMBER_REGISTERED = new BaseErrorType("999051", "CELL_PHONE_NUMBER_REGISTERED", "手机号已登记");
    public static final BaseErrorType PLEASE_DO_NOT_ADD_AGAIN = new BaseErrorType("999051", "PLEASE_DO_NOT_ADD_AGAIN", "请不要重复添加");
    String code;
    String name;
    String msg;
    String addMsg;

    public BaseErrorType(){};

    // 构造方法
    public BaseErrorType(String code, String name, String msg) {
        this.name = name;
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg+((addMsg==null||addMsg.trim()=="") ? "" : ("：" + addMsg));
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getAddMsg() {
		return addMsg;
	}

	public void setAddMsg(String addMsg) {
		this.addMsg = addMsg;
	}

	@Override
    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' + ((addMsg==null||addMsg.trim()=="") ? "" : ("：" + addMsg)) +
                '}';
    }
}
