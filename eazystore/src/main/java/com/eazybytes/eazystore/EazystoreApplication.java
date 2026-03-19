package com.eazybytes.eazystore;

import com.eazybytes.eazystore.dto.ContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableCaching
@EnableConfigurationProperties(value={ContactInfoDto.class})
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class EazystoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(EazystoreApplication.class, args);
	}

}
