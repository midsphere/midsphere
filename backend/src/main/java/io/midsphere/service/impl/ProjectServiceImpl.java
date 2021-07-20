package io.midsphere.service.impl;

import io.midsphere.dto.PageDTO;
import io.midsphere.exception.BizException;
import io.midsphere.exception.ProjectException;
import io.midsphere.mapper.ProjectMapper;
import io.midsphere.model.Project;
import io.midsphere.model.StatusEnum;
import io.midsphere.model.vo.ProjectQueryParam;
import io.midsphere.service.ProjectService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 工程业务实现类
 *
 * @author liqiwen
 * @since 1.0
 */

@Service
public class ProjectServiceImpl implements ProjectService {


    private final ApplicationEventPublisher publisher;

    private final ProjectMapper projectMapper;

    public ProjectServiceImpl(ProjectMapper projectMapper, ApplicationEventPublisher publisher) {
        this.projectMapper = projectMapper;
        this.publisher = publisher;
    }


    @Override
    public PageDTO<Project> findPage() {

        ProjectQueryParam queryParam = new ProjectQueryParam();
        long count = projectMapper.countByParam(queryParam);
        if(count == 0) {
            return new PageDTO<>(queryParam, 0, new ArrayList<>());
        }

        List<Project> projectList = projectMapper.findPage(queryParam);
        if(projectList == null || projectList.isEmpty()) {
            return new PageDTO<>(queryParam, 0, new ArrayList<>());
        }
        return new PageDTO<>(queryParam, count, projectList);
    }

    /**
     * 项目申请
     * @param project project
     * @throws BizException 业务异常
     */
    @Override
    public void applyProject(Project project) throws BizException {
        final String projectKey = project.getProjectKey();
        projectMapper.findByProjectKey(projectKey).orElseThrow(() ->
                new ProjectException("projectKey.exists", "该项目的 key 已经存在"));

        StatusEnum status = project.getStatus();
        if(status == null) {
            status = StatusEnum.CLOSE;
            project.setStatus(status);
        }
        project.setCreateAt(LocalDateTime.now());
        project.setModifyAt(LocalDateTime.now());

        projectMapper.insert(project);

        if(status == StatusEnum.OPEN) {
        }
    }

    /**
     * 校验 ProjectKey 的有效性
     * @param projectKey projectKey
     * @return boolean
     */
    @Transactional(readOnly = true)
    @Override
    public boolean validateProjectKey(String projectKey) {
        return projectMapper.findByProjectKey(projectKey).isPresent();
    }
}
