package io.midsphere;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 首页请求
 * @author liqiwen
 * @since 1.0
 */
@RestController
@RequestMapping
public class VersionController {


    /**
     * 获取版本信息
     * @return Map
     */
    @GetMapping
    public ResponseEntity<Map<String, Object>> index() {

        Map<String, Object> dataMap = new HashMap<>();

        dataMap.put("version", this.getClass().getPackage().getImplementationVersion());
        dataMap.put("name", "MidSphere 平台");

        return ResponseEntity.ok(dataMap);

    }
}
