package com.prowings.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestHelloController {
	
//	HelloController helloController = new HelloController();

	@InjectMocks
	HelloController helloController;
	@Mock
	HttpServletRequest req;
	@Mock
	HttpServletResponse resp;

	@Test
	public void testHello()
	{
		
		when(req.getRequestURL()).thenReturn(new StringBuffer("dummyurl"));
		String res = helloController.hello(req,resp);
		
		assertEquals("hello!!!!", res);
	}

}
