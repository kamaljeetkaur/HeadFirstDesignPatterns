package com.rd.factory;

import com.rd.factory.extra.ChicagoStylePepperoniPizza;
import com.rd.factory.extra.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza(new Toppings());
		} else if(type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza(new Toppings());
		} else if(type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza(new Toppings());
		}
		return pizza;
	}

}
