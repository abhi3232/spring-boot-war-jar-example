package com.proginators.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "This is test controller used to test the functionality of spring boot rest controller")
public class TestController {

	@RequestMapping(method = { RequestMethod.GET }, value = "/hello")
	@ApiOperation(value = "Greeting method to greet.")
	public String sayHello() {
		return "Hello Friends";
	}
}
