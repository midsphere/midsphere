package io.midsphere.model;

/**
 * 应用类型
 * @author liqiwen
 *
 */
public enum AppTypeEnum {

    /**
     * 服务端
     */
    SERVER("服务端"),

    /**
     * 客户端
     */
    CLIENT("客户端"),
    ;

    String description;

    AppTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
