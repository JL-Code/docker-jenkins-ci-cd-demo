package com.example.demo;

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

    @GetMapping("/hello")
    public Object methodName() {
        return "你好，我来自 Docker";
    }

    @GetMapping("/hello2")
    public Object methodName2() {
        return "我来自镜像覆盖输出";
    }
}
