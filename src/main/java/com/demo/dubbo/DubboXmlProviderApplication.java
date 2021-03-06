package com.demo.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml"})
public class DubboXmlProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboXmlProviderApplication.class, args);
	}

}
