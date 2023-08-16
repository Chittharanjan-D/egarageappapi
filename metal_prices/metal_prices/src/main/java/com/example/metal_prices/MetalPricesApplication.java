package com.example.metal_prices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackageClasses = MetalPricesRepository.class)
public class MetalPricesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetalPricesApplication.class, args);
	}

}
