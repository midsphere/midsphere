package io.midsphere.application.model;

/**
 * 语言枚举类型
 * @author liqiwen
 */
public enum LanguageEnum {

    JAVA("java"),
    JAVASCRIPT("javascript"),

    ;

    String code;

    LanguageEnum(String code) {
        this.code = code;
    }


    public String getCode() {
        return code;
    }
}
