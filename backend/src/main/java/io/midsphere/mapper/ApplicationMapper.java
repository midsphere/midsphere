package io.midsphere.mapper;

import io.midsphere.application.model.Application;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

/**
 * 应用 Mapper
 * @author liqiwen
 */
@Mapper
public interface ApplicationMapper {

    /**
     * 根据 id 查找应用
     * @param id id
     * @return Application
     */
    Optional<Application> findById(String id);

    /**
     * 根据 id 删除用户
     * @param id id
     */
    void deleteById(String id);

    /**
     * 根据 appKey 查询应用
     * @param appKey appKey
     * @param projectId projectId
     * @return Application
     */
    Optional<Application> findByAppKeyAndProject(@Param("appKey") String appKey,
                                                 @Param("projectId") Integer projectId);

    /**
     * 保存应用
     * @param application application
     */
    void insert(Application application);
}
