package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:5173")
@RequestMapping("/api")
public class ApiTestController {
	@GetMapping("/test")
	public String test() {
		return "spring boot 연결 성공!";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "2번째 커밋용 수정";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "3번째 커밋용 수정";
	}
}
