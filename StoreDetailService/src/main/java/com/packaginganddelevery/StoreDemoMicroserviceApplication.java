package com.packaginganddelevery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com")
public class StoreDemoMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreDemoMicroserviceApplication.class, args);
	}

}
