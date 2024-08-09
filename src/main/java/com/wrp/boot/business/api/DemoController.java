package com.wrp.boot.business.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wrp
 * @date 2024年08月09日 7:57
 * @since 1.0.0
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping("hello")
    public String hello() {
        return "hello!" + System.currentTimeMillis();
    }
}
