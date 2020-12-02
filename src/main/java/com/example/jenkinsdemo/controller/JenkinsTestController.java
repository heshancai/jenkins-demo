package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author heshancai
 * @Package com.example.jenkinsdemo.controller
 * @data 2020/11/30 15:44
 */
@RestController
public class JenkinsTestController {

    @RequestMapping("/testJenkins")
    public String testJenkins(){
        return "测试jenkins构建发布成功java程序:"+"666666";
    }

}
