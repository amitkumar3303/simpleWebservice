package com.example.atomProducer.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.atomProducer.model.AtomProducerResponse;

@Service
public class AtomProducerService {

	
	RestTemplate restTemplate = new RestTemplate();
    public ResponseEntity<String> employeeResponse(){
    	AtomProducerResponse employeeResponse = new AtomProducerResponse();
        HttpHeaders headers = new HttpHeaders();
    
        String url = "https://www.ing.nl/api/locator/atms/";
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<AtomProducerResponse> responseEntity = null;
        ResponseEntity<String> responseEntity1 =null;
        try {
          
             responseEntity1 = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        } catch (Exception e) {
            System.out.println("#######" + e.getMessage());
        }
        return responseEntity1;
    }
}
