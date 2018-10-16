package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		String url="http://provider-user/hello/"+name;
		return this.restTemplate.getForObject(url, String.class);
		
		//String greeting = this.restTemplate.getForObject("http://localhost:8090/greeting", String.class);
	    //return String.format("%s, %s!", greeting, name);
		
	}
}
