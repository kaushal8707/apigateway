package com.always.learner.apigateway;

import com.always.learner.apigateway.filter.Prefilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ApigatewayApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ApigatewayApplication.class, args);
	}

//	@Bean
//	public Prefilter prefilter()
//	{
//		return new Prefilter();
//	}
}
