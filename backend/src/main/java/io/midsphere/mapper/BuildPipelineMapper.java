package io.midsphere.mapper;

import io.midsphere.build.model.BuildPipeline;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * BuildPipelineMapper
 * @author liqiwen
 * @since 1.0
 */
@Mapper
public interface BuildPipelineMapper {


    /**
     * 根据应用 id 查找构建流水线
     * @param applicationId applicationId
     * @return List
     */
    List<BuildPipeline> findBuildPipelines(String applicationId);


    /**
     * 插入一个构建节点
     * @param buildPipeline buildPiple
     */
    void insertBuildPipeline(BuildPipeline buildPipeline);

}
