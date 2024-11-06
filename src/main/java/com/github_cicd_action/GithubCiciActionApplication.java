package com.github_cicd_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiciActionApplication {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome Pratik...";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCiciActionApplication.class, args);
	}

}
