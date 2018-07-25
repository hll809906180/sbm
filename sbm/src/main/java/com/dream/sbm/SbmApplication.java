package com.dream.sbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmApplication.class, args);
	}


}
