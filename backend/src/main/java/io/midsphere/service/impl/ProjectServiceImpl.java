package io.midsphere.service.impl;

import io.midsphere.mapper.ProjectMapper;
import io.midsphere.service.ProjectService;
import org.springframework.stereotype.Service;

/**
 * 工程业务实现类
 *
 * @author liqiwen
 * @since 1.0
 */

@Service
public class ProjectServiceImpl implements ProjectService {


    private final ProjectMapper projectMapper;

    public ProjectServiceImpl(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }





}
