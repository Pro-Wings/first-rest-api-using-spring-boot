package com.prowings.controller;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Student;

import io.swagger.annotations.Api;
@Api(value = "sample get resource")
@Controller
public class HelloController {
	
	 private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("/hello")
	public String hello(HttpServletRequest request, HttpServletResponse response)
	{
		  Instant start = Instant.now();
		  logger.info("Request URL::" + request.getRequestURL().toString() +":: Start Time=" + start);
		
		  //business logic
		  
		  logger.info("Response returned ::" + response+":: End Time=" + Instant.now());
		  logger.info("Total time required ::" + Duration.between(start, ZonedDateTime.now()));
		  
		  
		return "hello!!!!";
	}
		
}
