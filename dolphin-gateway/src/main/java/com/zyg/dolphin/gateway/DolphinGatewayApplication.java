package com.zyg.dolphin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zyg.dolphin.gateway")
public class DolphinGatewayApplication {


	public static void main(String[] args) {
		SpringApplication.run(DolphinGatewayApplication.class, args);
	}

}
