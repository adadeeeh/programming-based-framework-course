package com.pedro;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.pedro") //->optional
public class CreatureConfig {

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
