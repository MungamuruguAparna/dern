package com.derniercri.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import com.derniercri.service.intializer.DerniercriApplicationContextIntializer;
import com.derniercri.service.logging.DerniercriLogger;

@SpringBootApplication(scanBasePackages = {"com.derniercri.service.*"})
@Import(WebConfig.class)
public class CustomerApplication extends SpringBootServletInitializer{
	
	DerniercriLogger logger =DerniercriLogger.getLogger(CustomerApplication.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		System.out.println("------------------embedded----------------");
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("------------------standalone----------------");
		return builder.sources(CustomerApplication.class).initializers(new DerniercriApplicationContextIntializer());
	}
	
	@Bean
	public CommandLineRunner testDataBase() {
		return (args)->{
			jdbcTemplate.query("select * from system_user",  (rs,num)->{
				logger.debug("+======================================logging succed+++++++============================");
				System.out.println("data base connected sucessfully");
				return null;
			});
		};
	}

}
