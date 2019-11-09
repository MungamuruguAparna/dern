package com.derniercri.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PlatformApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		System.out.println("------------------embedded----------------");
		SpringApplication.run(PlatformApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("------------------standalone----------------");
		return builder.sources(PlatformApplication.class);
	}

}
