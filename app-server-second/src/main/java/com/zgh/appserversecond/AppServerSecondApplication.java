package com.zgh.appserversecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppServerSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServerSecondApplication.class, args);
	}

}
