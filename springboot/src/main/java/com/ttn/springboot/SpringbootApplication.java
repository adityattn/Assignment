package com.ttn.springboot;

import com.ttn.springboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {


		//Q3   Create Bean User containing two field username and password with Spring Context File (1 Mark)
		@Bean
		User user(){
			return new User();
		}
//Q2    Run Spring Boot Application with all the three ways (1 Mark)



	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
