package io.midsphere.constants;

import java.io.Serializable;

/**
 * 错误消息类型
 * @author liqiwen
 * @since 1.0
 */
public class Message implements Serializable {

    private String description;

    private String code;

    public Message(String code, String description) {
        super();
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
