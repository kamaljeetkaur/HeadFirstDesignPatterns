package com.rd.proxy;

public class GumballMonitor {
	
	GumballMachine gumballMachine;
	
	public GumballMonitor(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void report(){
		System.out.println("Gumball Machine----" + gumballMachine.location);
		System.out.println("count is ---" + gumballMachine.count);
	}

	public GumballMachine getGumballMachine() {
		return gumballMachine;
	}

	public void setGumballMachine(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

}
