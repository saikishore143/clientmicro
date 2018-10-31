
package com.fis.perfcoe.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



@RestController
@RequestMapping("/api")

public class ClientController {
	
	private RestTemplate restTemplate=new RestTemplate();

	@GetMapping("/getgreeting")
	public String greeting1() {
		String url = "http://microservice-perf-coe.devapps.fisdev.local/api/greeting";
		 HttpHeaders headers = new HttpHeaders();
            	 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            	 headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	         HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		// String url = "http://172.30.96.254:8080/api/greeting";
		System.out.println("URL" + url);
	        //ResponseEntity<String>  emp = restTemplate.getForEntity(url,String.class);
		 // String emp = restTemplate.getForObject(url,String.class);
	        //System.out.println("RESPONSE " + emp);
		ResponseEntity<String> res = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
       	        System.out.println(res);
	        return "sai";

	}

}
