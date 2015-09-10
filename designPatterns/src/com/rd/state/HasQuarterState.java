package com.rd.state;

public class HasQuarterState implements State {
	GumballMachine gm;
	 
	public HasQuarterState(GumballMachine gm) {
		this.gm = gm;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gm.setState(gm.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gm.setState(gm.getSoldState());		
	}

	@Override
	public void dispense() {
		 System.out.println("No gumball dispensed");
	}

	@Override
	public void refill() {}
	
	public String toString() {
		return "waiting for turn of crank";
	}
	
}
