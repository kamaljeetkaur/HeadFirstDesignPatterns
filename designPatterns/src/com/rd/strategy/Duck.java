package com.rd.strategy;

public abstract class Duck {

	FlyBehavior fb;
	QuackBehavior qb;
	
	public void performFly(){
		fb.fly();
	}
	
	public void performQuack(){
		qb.quack();
	}
	
	public void swim() {
		System.out.println("All ducks swim");
	}
	
	public FlyBehavior getFb() {
		return fb;
	}

	public void setFb(FlyBehavior fb) {
		this.fb = fb;
	}

	public QuackBehavior getQb() {
		return qb;
	}

	public void setQb(QuackBehavior qb) {
		this.qb = qb;
	}

	public abstract void display();
}
