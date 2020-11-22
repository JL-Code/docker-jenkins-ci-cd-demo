package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * <p>创建时间: 2020/10/13 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@Configuration
public class ConfigReadTest {
    @Value("${demo.config-value}")
    private String configValue;

    public String getConfigValue() {
        return configValue;
    }
}
