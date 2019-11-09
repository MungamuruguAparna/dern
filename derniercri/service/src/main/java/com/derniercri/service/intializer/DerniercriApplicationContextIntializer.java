package com.derniercri.service.intializer;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import com.derniercri.service.exception.ConfigFileLoadException;

public class DerniercriApplicationContextIntializer implements ApplicationContextInitializer<ConfigurableApplicationContext>{

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		String activeProfile=null;
		String SERVICE_CONFIG_NAME="derniercri-service-";
		String profileLocation=null;
		Resource resource=null;
		YamlPropertySourceLoader yamlPropertySourceLoader=null;
		List<PropertySource<?>> propertySources=null;
		ConfigurableEnvironment environment=null;
		
		System.out.println("======================================================this is intailizer================================= ");
		
		  activeProfile=applicationContext.getEnvironment().getActiveProfiles()[0];
		  System.out.println("the active profile is"+activeProfile);
		  profileLocation="classpath:/META-INF/"+SERVICE_CONFIG_NAME+activeProfile+".yaml";
		  resource=applicationContext.getResource(profileLocation);
		  yamlPropertySourceLoader=new YamlPropertySourceLoader();
		  environment=applicationContext.getEnvironment();
		  try {
			  propertySources=yamlPropertySourceLoader.load("config", resource);
			  for (PropertySource<?> propertySource : propertySources) {
				  environment.getPropertySources().addLast(propertySource);
			}
			  System.out.println("++++++++++++++++++++++config file loading is sucessfully++++++++++++++++++++++++++++++++++");
		} catch (IOException e) {
			throw new ConfigFileLoadException("unable to load "+profileLocation, e);
			
		}
		  
	}

}
