package com.rd.template;

public abstract class CaffeineBeverage {
	
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}


	public void pourInCup() {
		System.out.println("Pouring in cup");
	}

	public void boilWater(){
		System.out.println("Boiling Water");
	}
	
	boolean customerWantsCondiments(){
		return true;
	}
	

	public abstract void addCondiments();
	public abstract void brew();
		
	
	
}
