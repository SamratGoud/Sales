package org.tcs.Sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SalesController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping("/sales")
	public String getData(){
		String string = restTemplate.getForObject("http://production/getProduct", String.class);
		return "Sales data::****"+string;
		
		/*RestTemplate restTemplate= new RestTemplate();
		String string = restTemplate.getForObject("http://localhost:6010/getProduct", String.class);
		return"This is sales DepT:"+string;*/
		
		
	}
}
