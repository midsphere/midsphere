package io.midsphere.code.model;

import java.io.Serializable;

/**
 * 代码分支
 * @author liqiwen
 * @since 1.0
 */
public class CodeBranch implements Serializable {

    /**
     * 分支名称
     */
    private String branchName;


    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
