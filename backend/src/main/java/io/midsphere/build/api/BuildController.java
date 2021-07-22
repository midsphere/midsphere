package io.midsphere.build.api;

import io.midsphere.build.model.BuildPipeline;
import io.midsphere.build.service.BuildService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 构建控制器
 * @author liqiwen
 * @since 1.0
 */
@RestController
@RequestMapping("api")
public class BuildController {


    private final BuildService buildService;

    public BuildController(BuildService buildService) {
        this.buildService = buildService;
    }



    @GetMapping("build/{applicationId}/pipeline")
    public List<BuildPipeline> findBuildPipelines(@PathVariable("applicationId") String applicationId) {
        return buildService.findBuildPipelines(applicationId);
    }

    @GetMapping("build/{applicationId}/histories")
    public ResponseEntity<Void> findBuildHistories(@PathVariable("applicationId") String applicationId) {


        return ResponseEntity.noContent().build();
    }

}
