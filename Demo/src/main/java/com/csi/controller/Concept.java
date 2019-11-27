package com.csi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.test.Test;

@RestController
public class Concept {
	
	@Autowired
	Test t;
	int d;

	@GetMapping("/add")
	public int addition(){
	d=t.add();
		
	 return d;
	}
	
	@GetMapping("/sub")
	public int subtraction(){
		d=t.sub();
		return d;
	}
	@GetMapping("/mul")
	public int multiplication(){
		d= t.mul();
		return d;
	}
	@GetMapping("/div")
	public int division(){
		d=t.div();
		return d;
	}
}
