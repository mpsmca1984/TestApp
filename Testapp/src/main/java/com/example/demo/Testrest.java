package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Testrest {

	@RequestMapping("/")
	public String test() {
		return "welcome to docker container";
	}
}
