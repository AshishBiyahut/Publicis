package com.sapient.publicis.publicis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.publicis.publicis.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping("/getweather")
	public Object fetchWeather(@RequestParam String city) {
		return weatherService.getWeather(city);
	}
}
