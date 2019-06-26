package com.innavathon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class InnavathonApplication {


	public static void main(String[] args) {
		SpringApplication.run(InnavathonApplication.class, args);
	}


}
