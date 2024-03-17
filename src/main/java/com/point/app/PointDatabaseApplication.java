package com.point.app;

import com.point.app.moneytransactions.product.ProductRepository;
import com.point.app.springsecurity.RsaKeyProperties;

import com.point.app.user.Address;
import com.point.app.user.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Slf4j

@SpringBootApplication
public class PointDatabaseApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PointDatabaseApplication.class);
	}

	public static void main(String[] args) {
		
		SpringApplication.run(PointDatabaseApplication.class, args);
	}

}
