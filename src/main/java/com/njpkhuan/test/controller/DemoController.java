package com.njpkhuan.test.controller;

import com.njpkhuan.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huan
 */
@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("demo")
    public String demo() {
        return demoService.getDemo();
    }
}
