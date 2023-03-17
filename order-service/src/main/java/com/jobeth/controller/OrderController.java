package com.jobeth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Created with IntelliJ IDEA in 2023/3/17 10:28
 * <p>
 *
 * @author Jobeth
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/get")
    public String get() {
        return "get Order " + port;
    }
}
