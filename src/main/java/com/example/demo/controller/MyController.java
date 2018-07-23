package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Student;
import com.example.demo.beans.impl.XiaoMing;

@RestController
public class MyController {

	@Autowired
	private XiaoMing xiaoming;

	@Autowired
	private XiaoMing wanger;

	@Autowired
	private Student stu1;

	@Autowired
	private Student stu2;

	@RequestMapping(value = "/test.json", method = RequestMethod.GET)
	public String test() {
		System.err.println(xiaoming);
		System.err.println(wanger);
		return "hello";
	}

	@RequestMapping(value = "/test2.json", method = RequestMethod.GET)
	public String test2() {
		System.err.println(stu1);
		System.err.println(stu2);
		return "hi";
	}
}
