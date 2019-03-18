package com.pedro;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @ComponentScan("com.pedro") //->optional
//@PropertySource("classpath:creature.properties")
public class CreatureConfig {

//	@Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
	
	// define bean for bow
	@Bean
	public Weapon bow() {
		return new Bow();
	}
	
	// define bean for elf and inject dependency
	@Bean
	public Creature elf() {
		return new Elf(bow());
	}
}
