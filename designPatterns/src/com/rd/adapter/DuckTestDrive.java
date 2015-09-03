package com.rd.adapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		
		Duck duck = new MDuck();
		Turkey turkey = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("Turkey says....");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("Duck says....");
		testDuck(duck);
		/*duck.quack();
		duck.fly();*/
		
		System.out.println("Turkey Adapter says....");
		testDuck(turkeyAdapter);
		/*turkeyAdapter.quack();
		turkeyAdapter.fly();*/
		
	}

	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();		
	}
}
