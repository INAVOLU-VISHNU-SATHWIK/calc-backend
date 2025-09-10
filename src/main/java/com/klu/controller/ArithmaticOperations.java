package com.klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmaticOperations {
	
	@GetMapping("add/{A}/{B}")
	public String add(@PathVariable("A") int a ,@PathVariable("B") int b)
	{
		return " Addition" +(a+b);
	}
	@GetMapping("sub/{A}/{B}")
	public String sub(@PathVariable("A") int a ,@PathVariable("B") int b)
	{
		return "Subtraction= " +(a-b);
	}
	@GetMapping("mul/{A}/{B}")
	public String multiply(@PathVariable("A") int a ,@PathVariable("B") int b)
	{
		return "Mulitplication= " +(a*b);
	}

	@GetMapping("div/{A}/{B}")
	public String divide(@PathVariable("A") int a ,@PathVariable("B") int b)
	{
		return "Division= " +(a/b);
	}

}
