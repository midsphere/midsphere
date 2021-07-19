package io.midsphere.mapper;

import io.midsphere.model.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

/**
 * 工程管理
 * @author liqiwen
 * @since 1.0
 */
@Mapper
public interface ProjectMapper {

    /**
     * 根据 projectKey 查找 Project
     * @param projectKey projectKey
     * @return Project
     */
    Optional<Project> findByProjectKey(String projectKey);
}
