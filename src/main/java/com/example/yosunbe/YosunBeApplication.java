package com.example.yosunbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class YosunBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(YosunBeApplication.class, args);
	}

}
