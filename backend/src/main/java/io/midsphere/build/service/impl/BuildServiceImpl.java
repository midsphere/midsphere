package io.midsphere.build.service.impl;

import io.midsphere.build.model.BuildHistory;
import io.midsphere.build.model.BuildPipeline;
import io.midsphere.build.model.vo.BuildHistoryQueryRequest;
import io.midsphere.build.service.BuildService;
import io.midsphere.dto.PageDTO;
import io.midsphere.mapper.BuildPipelineMapper;
import org.apache.maven.shared.invoker.*;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Collections;
import java.util.List;


/**
 * 构建业务实现类
 * @author liqiwen
 * @since 1.0
 */
@Service
public class BuildServiceImpl implements BuildService {


    private final BuildPipelineMapper buildPipelineMapper;

    public BuildServiceImpl(BuildPipelineMapper buildPipelineMapper) {
        this.buildPipelineMapper = buildPipelineMapper;
    }


    @Override
    public void execBuild() {


        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile(new File("pom.xml"));
        request.setGoals(Collections.singletonList("compile"));

        Invoker invoker = new DefaultInvoker();

        //maven home
        invoker.setMavenHome(new File(""));

        try {
            invoker.execute(request);
        } catch (MavenInvocationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PageDTO<BuildHistory> findBuildHistories(BuildHistoryQueryRequest queryRequest) {
        return null;
    }

    @Override
    public List<BuildPipeline> findBuildPipelines(String applicationId) {
        final List<BuildPipeline> buildPipelines =
                buildPipelineMapper.findBuildPipelines(applicationId);
        return null;
    }
}
