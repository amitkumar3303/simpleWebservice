package com.example.atomProducer.model;

import java.util.List;

import lombok.Data;
@Data
public class Address {

	String street;
	String houseNumber;
	String postalcode;
	String city;
	GeoLocation geoLocation;
	String distance;
	List<OpeningHours> openingHours;
	String functionality;
	String type;
	
}
