package com.rd.observer;

import java.util.Observable;

public class WeatherData2 extends Observable {
	
	Float temp2;
	Float humidity2;
	Float pressure2;
	
	
	public Float getTemp2() {
		return temp2;
	}

	public void setTemp2(Float temp2) {
		this.temp2 = temp2;
	}

	public Float getHumidity2() {
		return humidity2;
	}

	public void setHumidity2(Float humidity2) {
		this.humidity2 = humidity2;
	}

	public Float getPressure2() {
		return pressure2;
	}

	public void setPressure2(Float pressure2) {
		this.pressure2 = pressure2;
	}

	public void measurementChange(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(Float temp, Float humidity, Float pressure){
		this.temp2 = temp;
		this.humidity2 = humidity;
		this.pressure2 = pressure;
		measurementChange();
	}
	
	


}
