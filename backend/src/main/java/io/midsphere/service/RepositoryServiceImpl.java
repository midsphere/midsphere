package io.midsphere.service;

import io.midsphere.exception.RepositoryException;
import io.midsphere.mapper.RepositoryMapper;
import io.midsphere.model.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 仓库异常
 * @author liqiwen
 * @since 1.0
 */
@Service
public class RepositoryServiceImpl implements RepositoryService {


    private final RepositoryMapper repositoryMapper;

    public RepositoryServiceImpl(RepositoryMapper repositoryMapper) {
        this.repositoryMapper = repositoryMapper;
    }


    @Override
    public List<Repository> listAll() throws RepositoryException {
        return null;
    }

    @Override
    public Integer addRepository(Repository repository) throws RepositoryException {
        return null;
    }

    @Override
    public Integer deleteRepository(Integer id) throws RepositoryException {
        return null;
    }
}
