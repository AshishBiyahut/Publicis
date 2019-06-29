package com.sapient.publicis.publicis.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponseData {

	@JsonProperty("main")
	private MainData mainData;
	
	@JsonProperty("weather")
	private List<Weather> WeatherList;
	
	private String dt_txt;
	
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
	public MainData getMainData() {
		return mainData;
	}
	public void setMainData(MainData mainData) {
		this.mainData = mainData;
	}
	public List<Weather> getWeatherList() {
		return WeatherList;
	}
	public void setWeatherList(List<Weather> weatherList) {
		WeatherList = weatherList;
	}
}
