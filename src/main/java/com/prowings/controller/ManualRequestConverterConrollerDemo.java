package com.prowings.controller;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prowings.exception.RequestMappingException;
import com.prowings.model.MyRequest;
import com.prowings.model.MyResponse;

@RestController
public class ManualRequestConverterConrollerDemo {
	ObjectMapper mapper = new ObjectMapper();

	@PostMapping("/request")
	public MyResponse doSomething(HttpEntity<String> entity) throws JsonProcessingException, InterruptedException {

		ZonedDateTime start = ZonedDateTime.now();
		MyRequest myRequest = null;
		try {
			System.out.println(">>>>>>>>>Request Started at : " + start);
			String incomingReq = entity.getBody();
			System.out.println("==========>"+incomingReq);
			myRequest = mapper.readValue(incomingReq, MyRequest.class);
			System.out.println(myRequest);
		} catch (Exception e) {
			System.out.println("exception while processing!!!");
			throw new RequestMappingException("Error while mapping request!!");
		} finally {
			System.out.println("Total time taken : " + Duration.between(start, ZonedDateTime.now()));
		}
		return processMyRequest(myRequest);

	}

	private MyResponse processMyRequest(MyRequest myRequest) {
		MyResponse res = new MyResponse();
		res.setCorrelationId(myRequest.getCorrelationId());
		res.setId(myRequest.getId());
		res.setName(myRequest.getName());
		return res;
	}

}
