package com.example.springboot_todo_lab;

import com.example.springboot_todo_lab.config.RandomProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RandomProps.class)
public class SpringbootTodoLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTodoLabApplication.class, args);
	}
}
