package com.rd.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay2 implements Observer,DisplayElement{
	Float temp2;
	Float humidity2;
	Observable observale;
	
	CurrentConditionsDisplay2(Observable observale){
		this.observale = observale;
		observale.addObserver(this);
	}

	@Override
	public void display() {
			System.out.println("CurrentConditions ---" + temp2 + " F and humidity --- "+ humidity2+"%  ----");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData2){
			WeatherData2 wd2 = (WeatherData2)o;
			this.temp2 = wd2.getTemp2();
			this.humidity2 = wd2.getHumidity2();
			display();
		}
	}

}
