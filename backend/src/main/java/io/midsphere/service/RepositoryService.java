package io.midsphere.service;

import io.midsphere.exception.RepositoryException;
import io.midsphere.model.Repository;

import java.util.List;

public interface RepositoryService {


    /**
     * 获取所有的仓库代码
     * @return List
     * @throws RepositoryException 仓库异常
     */
    List<Repository> listAll() throws RepositoryException;


    /**
     * 添加代码仓库
     * @param repository repository
     * @return Integer
     * @throws RepositoryException 异常
     */
    Integer addRepository(Repository repository) throws RepositoryException;


    /**
     * 删除仓库
     * @param id id
     * @return Integer
     * @throws RepositoryException 异常
     */
    Integer deleteRepository(Integer id) throws RepositoryException;
}
