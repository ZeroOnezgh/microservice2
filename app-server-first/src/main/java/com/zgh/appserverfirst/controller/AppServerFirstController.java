package com.zgh.appserverfirst.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanggh296 on 2019/12/1.
 */
@RestController
public class AppServerFirstController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(){
        return "hello,world!恭喜你调用成功了，这个是appServerFirst,port为："+port;
    }
}
