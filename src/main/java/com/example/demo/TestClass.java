package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

	@Autowired
	BuildProperties buildProperties;
	
	public TestClass() {
		System.out.println(buildProperties.getVersion());
	}
	
}
