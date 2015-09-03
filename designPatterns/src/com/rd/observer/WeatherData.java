package com.rd.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	Float temp;
	Float humidity;
	Float pressure;
	List<Observer> observersList;
	
	public WeatherData() {
		observersList = new ArrayList<Observer>();
	}
	
	@Override
	public void addObserver(Observer o) {
		observersList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observersList.indexOf(o);
		if(index>0){
			observersList.remove(index);		
		}
	}

	@Override
	public void notifyAllObservers() {
		for(Observer observer:observersList){
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void setMeasurements(Float temp, Float humidity, Float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChange();
	}
	
	public void measurementChange(){
		notifyAllObservers();
	}
	public Float getTemp() {
		return temp;
	}

	public void setTemp(Float temp) {
		this.temp = temp;
	}

	public Float getHumidity() {
		return humidity;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}

	public Float getPressure() {
		return pressure;
	}

	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}



}
