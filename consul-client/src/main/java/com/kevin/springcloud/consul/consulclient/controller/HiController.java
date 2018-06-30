package com.kevin.springcloud.consul.consulclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HiController
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/30 09:49
 */
@RestController
@RequestMapping(value = "/hi")
public class HiController {

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public String sayHi() {
        return "hi consul";
    }
}
