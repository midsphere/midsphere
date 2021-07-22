package io.midsphere.code.model;

import io.midsphere.code.VersionControlTypeEnum;

import java.io.Serializable;

/**
 * GitTag 模型
 * @author liqiwen
 * @since 1.0
 */
public class GitTagModel extends BaseTag implements Serializable {

    private String type = VersionControlTypeEnum.GIT.name();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
