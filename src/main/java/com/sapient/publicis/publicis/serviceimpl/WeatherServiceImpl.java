package com.sapient.publicis.publicis.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.publicis.publicis.client.RestClient;
import com.sapient.publicis.publicis.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private RestClient restClient;
	
	@Override
	public Object getWeather(String city) {
		return restClient.callApi(city);
	}
	
	
}
