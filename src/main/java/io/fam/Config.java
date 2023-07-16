package io.fam;

import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Configuration
@ComponentScan("io.fam")
public class Config {

	@Bean
	public Engine engine() {
		return new Engine("v8", 5);
	}

	@Bean
	public Transmission transmission() {
		return new Transmission("sliding");
	}

	@Bean("num7")
	public Integer getNumberSeven() {
		return Integer.valueOf(7);
	}

}
