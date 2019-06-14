package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
//@ContextConfiguration
//@MapperScan({ "com.dao" })	//就不用在每个dao上加@Mapper注解了
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
//@EnableEurekaServer
//@EnableEurekaClient
public class SpringbootExerciseApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootExerciseApplication.class, args);
	}
}
