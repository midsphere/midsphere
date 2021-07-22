package io.midsphere.code.api;

import io.midsphere.dto.PageDTO;
import io.midsphere.code.model.Repository;
import io.midsphere.code.model.RepositoryQueryRequest;
import io.midsphere.code.service.RepositoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public PageDTO<Repository> findPage(RepositoryQueryRequest queryParam) {
        return repositoryService.findPage(queryParam);
    }


    @PostMapping("repository")
    public ResponseEntity<Void> addRepository(@RequestBody Repository repository) {
        repositoryService.addRepository(repository);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("repository/{id}")
    public ResponseEntity<Void> deleteRepository(@PathVariable("id") Integer id) {
        repositoryService.deleteRepository(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("repository/{id}")
    public ResponseEntity<Void> updateRepository(@PathVariable("id") Integer id, @RequestBody Repository repository) {
        repository.setId(id);
        repositoryService.updateRepository(repository);
        return ResponseEntity.noContent().build();
    }

}
