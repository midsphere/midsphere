package io.midsphere.code;

import io.midsphere.code.model.BaseTag;
import io.midsphere.code.model.CodeBranch;
import org.apache.catalina.User;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.stereotype.Component;

import java.io.File;
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
     * 克隆仓库
     * @param repoUrl repoUrl
     * @param cloneDir cloneDir
     * @param credentialsProvider 凭证
     * @return Git
     * @throws GitAPIException GitAPIException
     */
    private Git fromCloneRepository(String repoUrl, String cloneDir, CredentialsProvider credentialsProvider) throws GitAPIException {
        return Git.cloneRepository()
                .setCredentialsProvider(credentialsProvider)
                .setURI(repoUrl)
                .setGitDir(new File(cloneDir))
                .call();
    }


    /**
     * 创建 git 凭证
     * @param username username
     * @param password password
     * @return CredentialsProvider
     */
    private CredentialsProvider credentialsProvider(String username, String password) {
        return new UsernamePasswordCredentialsProvider(username, password);
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
