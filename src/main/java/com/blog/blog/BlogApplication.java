package com.blog.blog;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class BlogApplication {

	public static void main(String[] args) {
		System.out.println("Application Start....");
		SpringApplication.run(BlogApplication.class, args);
	}

}
