package com.rd.factory.extra;

import com.rd.factory.ChicagoStyleCheesePizza;
import com.rd.factory.Pizza;

public class NYPizzaFactory extends PizzaFactory{
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")) {
			//pizza = new ChicagoStyleCheesePizza();
		} else if(type.equals("pepperoni")) {
			//pizza = new ChicagoStylePepperoniPizza();
		} else if(type.equals("veggie")) {
			//pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}
}
