package com.njpkhuan.test.controller;

import com.njpkhuan.test.service.WordCountService;
import com.sun.deploy.util.ArrayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

/**
 * @author huan
 */
@RestController
public class WordCountController {
    @Autowired
    WordCountService wordCountService;

    @GetMapping("wc/default")
    public String wordCount() {
        return Arrays.toString(wordCountService.getDefault().toArray());
    }
}
