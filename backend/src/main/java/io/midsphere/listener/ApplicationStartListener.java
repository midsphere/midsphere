package io.midsphere.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * 应用启动事件监听
 * @author liqiwen
 * @since 1.0
 */
@Component
public class ApplicationStartListener implements ApplicationListener<ApplicationReadyEvent> {


    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());


    @Value("${maven.home}")
    private String mavenHome;

    @Value("${gradle.home}")
    private String gradleHome;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        logger.info("method<onApplicationEvent> =====================应用启动了=====================");
        logger.info("method<onApplicationEvent> first steps: init properties.......................");
        initInternalProperties();


    }

    private void initInternalProperties() {

        Properties properties = new Properties();
        properties.setProperty("mavenHome", mavenHome);
        properties.setProperty("gradleHome", gradleHome);

        System.setProperties(properties);


    }
}
