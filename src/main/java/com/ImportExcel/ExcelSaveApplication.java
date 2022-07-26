package com.ImportExcel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ExcelSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelSaveApplication.class, args);
	}
	
}
