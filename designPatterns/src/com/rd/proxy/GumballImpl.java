package com.rd.proxy;

public class GumballImpl {
	public static void main(String[] args) {
		GumballMachine gmachine = new GumballMachine("NOIDA", 10);
		GumballMonitor gmonitor = new GumballMonitor(gmachine);
		gmonitor.report();
	}
}
