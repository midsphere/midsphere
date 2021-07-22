package io.midsphere.mapper;


import io.midsphere.code.model.Repository;
import io.midsphere.code.model.RepositoryQueryRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

/**
 * 代码仓库 Mapper
 * @author liqiwen
 */
@Mapper
public interface RepositoryMapper {

    /**
     * 查询仓库数量
     * @param queryParam queryParam
     * @return long
     */
    long countByParams(RepositoryQueryRequest queryParam);

    /**
     * 分页查询仓库
     * @param queryParam queryParam
     * @return List
     */
    List<Repository> findPage(RepositoryQueryRequest queryParam);

    /**
     * 根据 RepositoryUrl 查询仓库
     * @param repositoryUrl repositoryUrl
     * @return Repository
     */
    Optional<Repository> findByRepositoryUrl(String repositoryUrl);

    /**
     * 查询仓库
     * @param repository repository
     */
    void save(Repository repository);

    /**
     * 根据 id 查询仓库
     * @param id id
     * @return Repository
     */
    Optional<Repository> findById(Integer id);

    /**
     * 根据 id 删除仓库
     * @param id id
     */
    void deleteById(Integer id);

    /**
     * 更新仓库
     * @param repository repository
     */
    void update(Repository repository);
}
