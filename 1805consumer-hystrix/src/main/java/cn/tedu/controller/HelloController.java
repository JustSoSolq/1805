package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.tedu.ConsumerRunApp;
import cn.tedu.feign.ConsumerFeign;

@RestController
public class HelloController {
	
	@Autowired
	private ConsumerFeign feign;
	
	@GetMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="fallbackhello")
	public String hello(@PathVariable("name") String name){
		return feign.hello(name);
	}
	
	//对应上面的方法，参数必须一致，当访问失败时，hystrix直接回调用此方法
	public String fallbackhello(String name){
		return "tony";
	}
	
}
