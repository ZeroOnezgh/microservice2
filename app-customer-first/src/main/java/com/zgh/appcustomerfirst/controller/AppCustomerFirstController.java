package com.zgh.appcustomerfirst.controller;

import com.zgh.appcustomerfirst.service.AppCustomerFirstServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhanggh296 on 2019/12/1.
 */
@RestController
public class AppCustomerFirstController {
    @Autowired
    private AppCustomerFirstServer appCustomerFirstServer;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() {
        return appCustomerFirstServer.test();
    }

    @RequestMapping(value="/user/login",method=RequestMethod.GET)
    public String test1(){
        return "这是一个测试，恭喜小姐姐路由转发成功！";
    }
}
