
package com.fis.perfcoe.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;

import com.fis.perfcoe.models.CrudDTO;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ClientController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getgreeting")
	public UserDTO greeting1() {
		 String url = "http://microservice1-perfcoe-microservice.sdlocpapp.fisdev.local/api/greeting";
	        System.out.println("URL" + url);
	        
	        CrudDTO  emp = (CrudDTO ) restTemplate.getForObject(url, CrudDTO .class);

	        System.out.println("RESPONSE " + emp);

	        return emp;

	}

}
