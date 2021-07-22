package io.midsphere.mapper;

import io.midsphere.build.model.BuildHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * BuildMapper
 * @author liqiwen
 * @since 1.0
 */
@Mapper
public interface BuildHistoryMapper {


    /**
     * 查找应用的构建历史
     * @param applicationId 应用 id
     * @return List
     */
    List<BuildHistory> findBuildHistories(String applicationId);

    /**
     * 插入一条构建历史
     * @param buildHistory buildHistory
     */
    void insert(BuildHistory buildHistory);
}
