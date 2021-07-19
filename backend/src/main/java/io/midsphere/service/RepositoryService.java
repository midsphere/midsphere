package io.midsphere.service;

import io.midsphere.dto.PageDTO;
import io.midsphere.exception.BizException;
import io.midsphere.exception.RepositoryException;
import io.midsphere.model.Repository;
import io.midsphere.model.vo.ProjectQueryParam;
import io.midsphere.model.vo.RepositoryQueryParam;

import java.util.List;

public interface RepositoryService {


    /**
     * 获取所有的仓库代码
     * @param queryParam queryParam
     * @return PageDTO 返回该项目下的代码列表
     * @throws BizException 仓库异常
     */
    PageDTO<Repository> findPage(RepositoryQueryParam queryParam) throws BizException;


    /**
     * 添加代码仓库
     * @param repository repository
     * @return Integer
     * @throws RepositoryException 异常
     */
    Integer addRepository(Repository repository) throws BizException;


    /**
     * 删除仓库
     * @param id id
     * @return Integer
     * @throws RepositoryException 异常
     */
    Integer deleteRepository(Integer id) throws RepositoryException;


    /**
     * 修改仓库代码信息
     * @param repository repository
     * @throws BizException 业务异常
     */
    void updateRepository(Repository repository) throws BizException;
}
