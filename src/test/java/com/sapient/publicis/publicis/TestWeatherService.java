package com.sapient.publicis.publicis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.sapient.publicis.publicis.serviceimpl.WeatherServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestWeatherService {
	
	@InjectMocks
	WeatherServiceImpl weatherService;
	
	@Test
	public void testGetWeather() {
		weatherService.getWeather("bangalore");
	}
}
