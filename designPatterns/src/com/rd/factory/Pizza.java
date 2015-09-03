package com.rd.factory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	String name;
	String sauce;
	String dough;
	Toppings t;
	
	public Pizza(Toppings t){
		
	}
	
	
	public void prepare(){
		System.out.println("Preparing" + name);
		System.out.println("adding sauce" + sauce);
		System.out.println("adding toppings" + dough);
	}
	public void bake(){
		System.out.println("baking Pizza");
	}
	public void cut(){
		System.out.println("cutting Pizza");
	}
	public void box(){
		System.out.println("boxing Pizza");
	}
	public String getName(){
		return name;
	}

}
