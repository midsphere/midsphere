package io.midsphere.code;

import io.midsphere.code.model.BaseTag;
import io.midsphere.code.model.CodeBranch;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * git 代码处理器
 * @author liqiwen
 * @since 1.0
 */
@Component
public class GitCodeProcessor implements CodeProcessor {


    /**
     * 获取所有的 Tag
     * @return List
     */
    @Override
    public List<BaseTag> findAllTags() {
        return CodeProcessor.super.findAllTags();
    }

    /**
     * 获取所有的分支
     * @return List
     */
    @Override
    public List<CodeBranch> findAllBranches() {
        return CodeProcessor.super.findAllBranches();
    }

    /**
     * 克隆代码
     * @param repositoryUrl repositoryUrl
     */
    @Override
    public void cloneCode(String repositoryUrl) {


    }

    /**
     * 版本控制类型
     * @return versionControlTypeEnum
     */
    @Override
    public VersionControlTypeEnum versionControlType() {
        return VersionControlTypeEnum.GIT;
    }
}
