package com.rd.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	Float temp;
	Float humidity;
	WeatherData wd;
	
	CurrentConditionsDisplay(WeatherData wd){
		this.wd = wd;
		wd.addObserver(this);
	}

	@Override
	public void display() {
			System.out.println("CurrentConditions ---" + temp + " F and humidity --- "+ humidity+"%  ----");
	}

	@Override
	public void update(Float temp, Float humidity, Float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
