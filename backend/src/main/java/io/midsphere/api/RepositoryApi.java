package io.midsphere.api;

import io.midsphere.model.Repository;
import io.midsphere.service.RepositoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 仓库代码管理
 * @author liqiwen
 * @since 1.0
 */
@RestController
@RequestMapping("api")
public class RepositoryApi {


    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());


    private final RepositoryService repositoryService;

    public RepositoryApi(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }


    @GetMapping("repositories")
    public List<Repository> listAll() {
        return repositoryService.listAll();
    }

}
