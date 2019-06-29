package com.sapient.publicis.publicis.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.sapient.publicis.publicis.model.ApiResponseData;

@Component
public class RestClient {

	private static String url ="http://api.openweathermap.org/data/2.5/forecast?mode=json&appid=d2929e9483efc82c82c32ee7e02d563e";
	
	RestTemplate restTemplate = new RestTemplate();
	
	public ApiResponseData callApi(String city) {
		ApiResponseData data= restTemplate.getForObject
		(UriComponentsBuilder.fromHttpUrl(url).queryParam("q", city).toUriString(), ApiResponseData.class);
		System.out.println(data);
		return data;
	}
}
