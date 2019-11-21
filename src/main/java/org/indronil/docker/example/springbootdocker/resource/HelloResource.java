package org.indronil.docker.example.springbootdocker.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("rest/docker/hello")
public class HelloResource {

	@GetMapping
	public String hello() {
		return "Hello Gradle Spring boot";
		
	}
}
