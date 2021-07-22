package io.midsphere.mapper;

import io.midsphere.project.model.Project;
import io.midsphere.project.vo.ProjectQueryRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
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


    /**
     * 保存工程
     * @param project project
     */
    void insert(Project project);

    /**
     * 获取项目的数量
     * @param queryParam queryParam
     * @return long
     */
    long countByParam(ProjectQueryRequest queryParam);

    /**
     * 分页查询 Project
     * @param queryParam queryParam
     * @return List
     */
    List<Project> findPage(ProjectQueryRequest queryParam);

    /**
     * 根据 id 查找 Project
     * @param id id
     * @return Project
     */
    Optional<Project> findById(Integer id);
}
