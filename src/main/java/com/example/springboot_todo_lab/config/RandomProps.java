package com.example.springboot_todo_lab.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my")
public record RandomProps(int luckyNum) {
}
