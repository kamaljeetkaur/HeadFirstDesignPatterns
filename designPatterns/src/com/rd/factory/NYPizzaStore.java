package com.rd.factory;

import com.rd.factory.extra.NYStylePepperoniPizza;
import com.rd.factory.extra.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza(new Toppings());
		} else if(type.equals("pepperoni")) {
			return new NYStylePepperoniPizza(new Toppings());
		} else if(type.equals("veggie")) {
			return new NYStyleVeggiePizza(new Toppings());
		}
		return pizza;
	}

}
