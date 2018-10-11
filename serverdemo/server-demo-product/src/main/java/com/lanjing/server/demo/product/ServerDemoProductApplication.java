package com.lanjing.server.demo.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerDemoProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDemoProductApplication.class, args);
	}
}
