package io.midsphere.build.service;

import io.midsphere.build.model.BuildHistory;
import io.midsphere.build.model.BuildPipeline;
import io.midsphere.build.model.vo.BuildHistoryQueryRequest;
import io.midsphere.dto.PageDTO;

import java.util.List;


/**
 * 构建 service
 * @author liqiwen
 * @since 1.0
 */
public interface BuildService {



    void execBuild();


    /**
     * 获取构建历史
     * @param queryRequest queryRequest
     * @return PageDTO
     */
    PageDTO<BuildHistory> findBuildHistories(BuildHistoryQueryRequest queryRequest);


    /**
     * 获取当前应用的构建流水线
     * @param applicationId application
     * @return List
     */
    List<BuildPipeline> findBuildPipelines(String applicationId);
}
