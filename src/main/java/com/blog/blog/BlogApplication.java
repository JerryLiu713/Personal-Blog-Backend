package com.blog.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		System.out.println("Application Start....");
		SpringApplication.run(BlogApplication.class, args);
	}

}
