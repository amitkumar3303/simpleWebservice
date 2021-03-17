package com.example.atomProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.atomProducer.model.AtomProducerResponse;
import com.example.atomProducer.service.AtomProducerService;


@RestController
public class AtomProducerController {

	@Autowired
	AtomProducerService  atomProducerService ;
	
	 @RequestMapping(value = "/allAtom", method = RequestMethod.GET)
	    public ResponseEntity<String> allEmployeesMethod() {
	        return atomProducerService.employeeResponse();
	    }
}
