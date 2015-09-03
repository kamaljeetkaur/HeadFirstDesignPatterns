package com.rd.strategy;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
			System.out.println("Ducks Can not Fly");
	}

}
