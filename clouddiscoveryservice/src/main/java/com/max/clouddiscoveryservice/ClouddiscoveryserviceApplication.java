package com.max.clouddiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClouddiscoveryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClouddiscoveryserviceApplication.class, args);
	}

}
