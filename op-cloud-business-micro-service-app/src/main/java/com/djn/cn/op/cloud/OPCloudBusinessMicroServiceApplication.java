package com.djn.cn.op.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient   // 开启 EurekaClient 
@EnableHystrix        // 
@EnableFeignClients   // 开启EnableFeignClients  
@SpringBootApplication
public class OPCloudBusinessMicroServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OPCloudBusinessMicroServiceApplication.class, args);
	}
}
