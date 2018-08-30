
package com.fis.perfcoe.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;



@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ClientController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getgreeting")
	public String greeting1() {
		 String url = "http://microservice1-perfcoe-microservice.sdlocpapp.fisdev.local/api/greeting/name=sai";
	        System.out.println("URL" + url);
	        
	        String  emp = restTemplate.getForEntity(url,String.class);

	        System.out.println("RESPONSE " + emp);

	        return emp;

	}

}
