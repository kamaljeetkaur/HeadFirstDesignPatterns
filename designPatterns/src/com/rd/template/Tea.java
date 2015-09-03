package com.rd.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon");
	}

	@Override
	public void brew() {
		System.out.println("Stipping the tea");

	}
	
	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")){
			return true;
		} else {
			return false;
		}
	}
	
	String getUserInput() {
		String answer = null;
		System.out.println("Would you like lemon in your tea");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = br.readLine();
		}catch(IOException e){
			System.out.println("error");
		}
		if(answer.equals(null)) {
			return "no";
		}
		return answer;
	}
	
}
