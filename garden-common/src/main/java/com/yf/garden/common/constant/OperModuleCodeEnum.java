package com.yf.garden.common.constant;

/**
 * 操作模块编码枚举
 * @author 张继生
 */
public enum OperModuleCodeEnum {

    //app
    APP_JOIN_OS("加入我们","101001001"),


    //小程序
    APPLET_CHECK_GARDEN("果园检验","102001001"),

    //大屏
    BC_XXX("XXX","103001001"),


    //pc
    PC_APPROVE_GARDEN("果园审核","104001001");

    private String desc;
    private String code;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private OperModuleCodeEnum(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }
}
