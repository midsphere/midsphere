package io.midsphere.api;


import io.midsphere.dto.PageDTO;
import io.midsphere.model.Project;
import io.midsphere.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 项目 Api
 * @author liqiwen
 * @since 1.0
 */
@RestController
@RequestMapping("api")
public class ProjectApi {


    private final ProjectService projectService;


    public ProjectApi(ProjectService projectService) {
        this.projectService = projectService;
    }

    /**
     * TODO 这里涉及到人员的权限问题，普通人可能只有部分应用的权限
     * @return PageDTO
     */
    @GetMapping("projects")
    public PageDTO<Project> findPage() {

        return projectService.findPage();
    }

    /**
     * 校验 projectKey 的有效性
     * projectKey 在项目的维度下必须唯一
     * @param projectKey projectKey
     * @return boolean
     */
    @GetMapping("project/{key}/valid")
    public ResponseEntity<Boolean> validProjectKey(@PathVariable("key") String projectKey) {
        return ResponseEntity.ok(projectService.validateProjectKey(projectKey));
    }


    /**
     * 申请项目
     * @param project project
     * @return Void
     */
    @PostMapping("project/apply")
    public ResponseEntity<Void> applyProject(@RequestBody Project project) {

        projectService.applyProject(project);

        return ResponseEntity.noContent().build();
    }

}
