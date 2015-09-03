package com.rd.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		qb = new Quack();
		fb = new FlyWithWings();
	}
	
	@Override
	public void display() {
			System.out.println("I am a mallard duck");
	}
	
	

}
