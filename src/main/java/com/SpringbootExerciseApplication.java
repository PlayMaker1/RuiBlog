package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//@ContextConfiguration
//@MapperScan({ "com.dao" })	//就不用在每个dao上加@Mapper注解了
//@EnableAutoConfiguration
//@ComponentScan

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
//@EnableEurekaServer
//@EnableEurekaClient
public class SpringbootExerciseApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootExerciseApplication.class, args);
	}
}
