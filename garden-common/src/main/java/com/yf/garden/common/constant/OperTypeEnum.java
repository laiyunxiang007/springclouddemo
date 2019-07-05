package com.yf.garden.common.constant;

/**
 * 操作类型枚举
 * @author 张继生
 */
public enum OperTypeEnum {

    OPER_TYPE_ADD("新增"),
    OPER_TYPE_UPDATE("修改"),
    OPER_TYPE_DELETE("删除"),
    OPER_TYPE_INTERFACE_CALL("接口调用");

    private OperTypeEnum(String value) {
        this.value= value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
