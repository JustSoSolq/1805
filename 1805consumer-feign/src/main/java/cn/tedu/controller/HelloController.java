package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.tedu.ConsumerRunApp;
import cn.tedu.feign.ConsumerFeign;

@RestController
public class HelloController {
	
	@Autowired
	private ConsumerFeign feign;
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name){
		return feign.hello(name);
	}
}
