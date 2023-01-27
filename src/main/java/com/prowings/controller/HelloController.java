package com.prowings.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Student;

import io.swagger.annotations.Api;
@Api(value = "sample get resource")
@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello!!!!";
	}
		
}
