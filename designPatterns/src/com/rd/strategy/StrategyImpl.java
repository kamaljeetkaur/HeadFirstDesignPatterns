package com.rd.strategy;

public class StrategyImpl {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.display();
		
		FlyBehavior fb = new FlyNoWay();
		QuackBehavior qb = new MuteQuack();
		
		duck.setFb(fb);
		duck.setQb(qb);
		
		duck.performFly();
		duck.performQuack();
		duck.display();
		
	}

}
