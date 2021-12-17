package com.sample.controller;

import com.sample.core.dto.TestData;
import com.sample.core.service.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestServiceImpl testService;

    @GetMapping("/")
    public String index() {
        log.info("[TestController]");
        TestData testData = testService.doAnything();
        log.info("[TestController] ID : {}", testData.getId());
        log.info("[TestController] NAME :{}", testData.getName());
        return "index";
    }

}
