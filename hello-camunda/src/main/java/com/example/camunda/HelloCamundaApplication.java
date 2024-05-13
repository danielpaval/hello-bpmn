package com.example.camunda;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Deployment(resources = "classpath*:/definitions/*.*")
@SpringBootApplication
public class HelloCamundaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloCamundaApplication.class, args);
	}

}
