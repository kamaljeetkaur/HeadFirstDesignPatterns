package com.rd.observer;

import java.util.Observer;

public class WeatherStation {
	public static void main(String[] args) {
		
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
		wd.setMeasurements(22.27f, 33.23f, 44.34f);
		
		WeatherData2 wd2= new WeatherData2();
		Observer ob = new CurrentConditionsDisplay2(wd2);
		wd2.setMeasurements(66f, 99f, 33f);
		
		
	}

}
