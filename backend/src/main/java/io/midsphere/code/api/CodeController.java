package io.midsphere.code.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 代码控制器
 * @author liqiwen
 * @since 1.0
 */
@RequestMapping("api")
@RestController
public class CodeController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

}
