package io.midsphere.code;

import io.midsphere.code.model.BaseTag;
import io.midsphere.code.model.CodeBranch;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码处理器
 * @author liqiwen
 * @since 1.0
 */
public interface CodeProcessor {


    /**
     * 获取所有的分支
     * @return List
     */
    default List<CodeBranch> findAllBranches() {
        return new ArrayList<>();
    }


    /**
     * 获取所有的 Tag
     * @return List
     */
    default List<BaseTag> findAllTags() {
        return new ArrayList<>();
    }


    /**
     * 克隆代码
     * @param repositoryUrl repositoryUrl
     */
    default void cloneCode(String repositoryUrl) {

    }


    /**
     * 版本控制类型
     * @return VersionControlTypeEnum
     */
    VersionControlTypeEnum versionControlType();
}
