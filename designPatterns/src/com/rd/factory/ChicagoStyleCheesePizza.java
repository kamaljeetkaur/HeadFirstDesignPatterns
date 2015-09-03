package com.rd.factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza(Toppings t){
		super(t);
		name = "Chicago style cheese pizza";
		dough = "thick crust";
		sauce = "mayonese sauce";
	}

}
