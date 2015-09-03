package com.rd.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("GOBBLE");
	}

	@Override
	public void fly() {
		System.out.println("FLY");
	}

}
