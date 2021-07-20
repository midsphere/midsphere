package io.midsphere.service.impl;

import io.midsphere.exception.ApplicationException;
import io.midsphere.exception.BizException;
import io.midsphere.exception.ProjectException;
import io.midsphere.mapper.ApplicationMapper;
import io.midsphere.mapper.ProjectMapper;
import io.midsphere.model.Application;
import io.midsphere.model.Project;
import io.midsphere.service.ApplicationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;


/**
 * 应用业务实现类
 * @author liqiwen
 * @since 1.0
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationMapper applicationMapper;

    private final ProjectMapper projectMapper;

    public ApplicationServiceImpl(ApplicationMapper applicationMapper, ProjectMapper projectMapper) {
        this.applicationMapper = applicationMapper;
        this.projectMapper = projectMapper;
    }


    @Transactional(readOnly = true)
    @Override
    public Application findById(String id) throws BizException {
        return applicationMapper.findById(id).orElseThrow(() ->
                new ApplicationException("application.notExists", "应用不存在"));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void delete(String id) throws BizException {
        final Application application = applicationMapper.findById(id).orElseThrow(()
                -> new ApplicationException("application.notExists", "应用不存在"));
        applicationMapper.deleteById(application.getId());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void update(Application application) throws BizException {
        Application oldApplication = applicationMapper.findById(application.getId()).orElseThrow(() ->
                new ApplicationException("application.notExists", "应用不存在"));



    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void save(Application application) throws BizException {
        final String appKey = application.getAppKey();

        Project project = application.getProject();
        final String id = project.getId();

        project = projectMapper.findById(id).orElseThrow(()
                -> new ProjectException("project.notExists", "项目不存在"));

        // 同一个项目下不允许有两个相同 appKey 的应用
        Optional<Application> applicationOp = applicationMapper.findByAppKeyAndProject(appKey,
                project.getId());
        if(applicationOp.isPresent()) {
            throw new ApplicationException("appKey.exists", "应用 key 已经存在");
        }

        application.setCreateAt(LocalDateTime.now());
        application.setModifyAt(LocalDateTime.now());

        applicationMapper.insert(application);
    }
}
