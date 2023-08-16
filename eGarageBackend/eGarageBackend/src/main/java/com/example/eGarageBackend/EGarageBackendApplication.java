package com.example.eGarageBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example.eGarageBackend")
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan
public class EGarageBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EGarageBackendApplication.class, args);
	}

}
