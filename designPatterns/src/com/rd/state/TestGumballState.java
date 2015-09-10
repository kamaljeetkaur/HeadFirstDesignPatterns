package com.rd.state;

public class TestGumballState {
	public static void main(String[] args) {
		GumMachine1 gm = new GumMachine1(5);
		System.out.println("Gumball machine");
		gm.insertQuater();
		gm.turnCrank();
		
		System.out.println("Gumball machine");
		gm.insertQuater();
		gm.ejectQuater();
		gm.turnCrank();
			
		System.out.println("Gumball machine");
		gm.insertQuater();
		gm.turnCrank();
		gm.insertQuater();
		gm.turnCrank();
		gm.ejectQuater();
		
		System.out.println("Gumball machine");
		gm.insertQuater();
		gm.insertQuater();
		gm.turnCrank();
		gm.insertQuater();
		gm.turnCrank();
		gm.insertQuater();
		gm.turnCrank();
	}
}
