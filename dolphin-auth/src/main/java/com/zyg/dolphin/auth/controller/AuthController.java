package com.zyg.dolphin.auth.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author zy
 * @Date 2024/8/5 23:04
 **/
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    @RequestMapping("/test")
    public String test() {
        return "test1";
    }

    @RequestMapping("/health/check")
    public String health() {
        return "success";
    }
}
