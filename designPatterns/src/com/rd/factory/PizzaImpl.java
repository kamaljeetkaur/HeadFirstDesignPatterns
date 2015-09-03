package com.rd.factory;

public class PizzaImpl {
	public static void main(String[] args) {
		
		PizzaStore ps1 = new NYPizzaStore();
		Pizza p1 = ps1.orderPizza("cheese");
		
		
		System.out.println("ordered " + p1.getName());
		
		
		PizzaStore ps2 = new ChicagoPizzaStore();
		Pizza p2 = ps2.orderPizza("cheese");
		System.out.println("ordered " + p2.getName());
		
	}

}
