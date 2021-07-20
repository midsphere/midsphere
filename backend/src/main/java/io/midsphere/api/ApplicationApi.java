package io.midsphere.api;

import io.midsphere.model.Application;
import io.midsphere.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 应用接口类
 * @author liqiwen
 * @since 1.0
 */
@RestController
@RequestMapping("api")
public class ApplicationApi {


    private final ApplicationService applicationService;

    public ApplicationApi(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    /**
     * 查找应用
     * @param id id
     * @return Application
     */
    @GetMapping("application/{id}")
    public Application findById(@PathVariable("id") String id) {
        return applicationService.findById(id);
    }

    /**
     * 删除应用
     * @param id id
     * @return Void
     */
    @DeleteMapping("application/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        applicationService.delete(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * 修改应用
     * @param id id
     * @param application application
     * @return Void
     */
    @PutMapping("application/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") String id, @RequestBody Application application) {
        application.setId(id);
        applicationService.update(application);
        return ResponseEntity.noContent().build();
    }

    /**
     * 保存应用
     * @param application application
     * @return Void
     */
    @PostMapping("application")
    public ResponseEntity<Void> save(@RequestBody Application application) {
        applicationService.save(application);
        return ResponseEntity.noContent().build();
    }
}
