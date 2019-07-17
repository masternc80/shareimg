package com.shareimg.dishes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {
	    MongoAutoConfiguration.class,
	    MongoReactiveDataAutoConfiguration.class 
	})
public class DishesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DishesServiceApplication.class, args);
	}

}
