package com.zgh.appcustomerfirst.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhanggh296 on 2019/12/1.
 */

@FeignClient(value="app-server")
@Service
public interface AppCustomerFirstServer {
    @RequestMapping("/test")
     String test();
}
