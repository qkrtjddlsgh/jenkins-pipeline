package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	
	@RequestMapping("/")
	String home() {		
		return "소스 코드 커밋 -> 젠킨스 빌드 -> 스캐폴드 배포";
	}
	
	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}