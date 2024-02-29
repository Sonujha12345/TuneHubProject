package com.kodnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(excludeName =" DataSourceAutoConfiguration.class")
public class TuneHumbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuneHumbProjectApplication.class, args);
	}

}
