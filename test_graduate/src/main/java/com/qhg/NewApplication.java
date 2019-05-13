package com.qhg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.qhg.dao")
@SpringBootApplication
public class NewApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NewApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NewApplication.class);
	}

}
//public class NewApplication {
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(NewApplication.class, args);
//	}
//
//}



