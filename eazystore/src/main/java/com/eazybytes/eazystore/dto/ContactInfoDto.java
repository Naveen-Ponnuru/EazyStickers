package com.eazybytes.eazystore.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("contact")
public record ContactInfoDto( String email,String phone, String address) {
}
