package io.midsphere.code.service.impl;

import io.midsphere.dto.PageDTO;
import io.midsphere.exception.BizException;
import io.midsphere.exception.RepositoryException;
import io.midsphere.mapper.ProjectMapper;
import io.midsphere.mapper.RepositoryMapper;
import io.midsphere.project.model.Project;
import io.midsphere.code.model.Repository;
import io.midsphere.code.model.RepositoryQueryRequest;
import io.midsphere.code.service.RepositoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 仓库业务处理类
 * @author liqiwen
 * @since 1.0
 */
@Service
public class RepositoryServiceImpl implements RepositoryService {


    private final RepositoryMapper repositoryMapper;

    private final ProjectMapper projectMapper;

    public RepositoryServiceImpl(RepositoryMapper repositoryMapper, ProjectMapper projectMapper) {
        this.repositoryMapper = repositoryMapper;
        this.projectMapper = projectMapper;
    }


    @Override
    public PageDTO<Repository> findPage(RepositoryQueryRequest queryParam) throws BizException {

        final String projectKey = queryParam.getProjectKey();

        final Project project = projectMapper.findByProjectKey(projectKey).orElseThrow(()
                -> new BizException("project.notExists", "项目不存在"));

        queryParam.setProjectKey(project.getProjectKey());

        long count = repositoryMapper.countByParams(queryParam);
        if (count == 0) {
            return new PageDTO<>(queryParam, 0, new ArrayList<>());
        }

        final List<Repository> datas = repositoryMapper.findPage(queryParam);
        if(datas == null || datas.isEmpty()) {
            return new PageDTO<>(queryParam, 0, new ArrayList<>());
        }

        return new PageDTO<>(queryParam, count, datas);
    }

    @Override
    public Integer addRepository(Repository repository) throws BizException {
        final Project project = repository.getProject();
        projectMapper.findByProjectKey(project.getProjectKey()).orElseThrow(() ->
                new BizException("project.notExists", "项目不存在"));

        final String repositoryUrl = repository.getRepositoryUrl();
        Optional<Repository> repositoryOp = repositoryMapper.findByRepositoryUrl(repositoryUrl);
        if(repositoryOp.isPresent()) {
            throw new RepositoryException("repositoryUrl.exists", "仓库地址已经存在");
        }
        repositoryMapper.save(repository);
        return repository.getId();
    }

    @Override
    public Integer deleteRepository(Integer id) throws RepositoryException {
        final Repository repository = repositoryMapper.findById(id).orElseThrow(()
                -> new RepositoryException("repository.notExists", "仓库不存在"));
        repositoryMapper.deleteById(repository.getId());
        return 0;
    }

    @Override
    public void updateRepository(Repository repository) throws BizException {
        Repository oldRepository = repositoryMapper.findById(repository.getId()).orElseThrow(()
                -> new RepositoryException("repository.notExists", "仓库不存在"));

        repositoryMapper.update(repository);
    }
}
