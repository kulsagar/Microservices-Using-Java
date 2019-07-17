package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class TollRateController {

	@Autowired
	private RestTemplate restTemp;
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@RequestMapping(path = "/tolldetails", params= {"stationId"})
	public String getTollDetails(@RequestParam String stationId, Model m) {
		TollRate tr = restTemp.getForObject("http://toll-service/tollrate" + stationId, TollRate.class);
		m.addAttribute("tollrate", tr);
		return "console";
	}
	
	@RequestMapping("/")
	public @ResponseBody String hello() {
		return "hello";
	}
	
}
