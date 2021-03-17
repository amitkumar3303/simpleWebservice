package com.example.atomConsumer.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AtomConsumerService {

	
	RestTemplate restTemplate = new RestTemplate();
    public ResponseEntity<String> employeeResponse(){
    	
        HttpHeaders headers = new HttpHeaders();
    
        String url = "http://localhost:3031/allAtom";
        HttpEntity<?> entity = new HttpEntity<>(headers);
       
        ResponseEntity<String> responseEntity =null;
        try {
          
             responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        } catch (Exception e) {
            System.out.println("#######" + e.getMessage());
        }
        return responseEntity;
    }
}
