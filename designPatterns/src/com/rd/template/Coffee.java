package com.rd.template;

public class Coffee extends CaffeineBeverage {

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

}
