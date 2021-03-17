package com.example.atomConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.atomConsumer.service.AtomConsumerService;

@RestController
public class AtomConsumerController {

	
	@Autowired
	AtomConsumerService  atomConsumerService ;
	
	 @RequestMapping(value = "/allAtomConsumer", method = RequestMethod.GET)
	    public ResponseEntity<String> allEmployeesMethod() {
	        return atomConsumerService.employeeResponse();
	    }
}
