package io.midsphere.model;

/**
 * 状态
 * @author liqiwen
 */
public enum StatusEnum {

    OPEN("开启"),
    CLOSE("关闭"),
    DEPRECATED("废弃"),
    ;

    String description;

    StatusEnum(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }


}
