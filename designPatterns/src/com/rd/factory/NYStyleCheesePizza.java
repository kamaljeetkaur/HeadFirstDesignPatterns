package com.rd.factory;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza(Toppings t){
		super(t);
		name = "NY style cheese pizza";
		dough = "thin crust";
		sauce = "mustard sauce";
	}

}
