package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>创建时间: 2020/9/20 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@RestController
public class HelloController {

    @Value("${demo.config-value}")
    private String configValue;

    @GetMapping("/hello")
    public Object methodName() {
        return "你好，我来自 Docker";
    }

    @GetMapping("/config/info")
    public Object getConfigInfo() {
        return configValue;
    }
}
