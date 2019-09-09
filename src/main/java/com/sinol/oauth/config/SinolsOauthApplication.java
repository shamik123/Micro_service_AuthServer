package com.sinol.oauth.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan("com.sinol")
@EnableJpaRepositories("com.sinol")
@ComponentScan("com.sinol")
@RestController
@EnableEurekaClient
public class SinolsOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinolsOauthApplication.class, args);
	}

}

