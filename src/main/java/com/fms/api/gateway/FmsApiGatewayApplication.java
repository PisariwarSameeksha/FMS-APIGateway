package com.fms.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FmsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmsApiGatewayApplication.class, args);
	}

}
