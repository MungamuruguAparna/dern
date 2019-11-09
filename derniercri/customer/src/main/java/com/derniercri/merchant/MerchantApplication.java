package com.derniercri.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MerchantApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		System.out.println("------------------embedded----------------");
		SpringApplication.run(MerchantApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("------------------standalone----------------");
		return builder.sources(MerchantApplication.class);
	}

}
