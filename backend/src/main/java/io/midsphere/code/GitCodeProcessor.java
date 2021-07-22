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



    @Override
    public List<BaseTag> findAllTags() {
        return CodeProcessor.super.findAllTags();
    }

    @Override
    public List<CodeBranch> findAllBranches() {
        return CodeProcessor.super.findAllBranches();
    }

    @Override
    public VersionControlTypeEnum versionControlType() {
        return VersionControlTypeEnum.GIT;
    }
}
