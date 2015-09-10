package com.rd.state;

enum State1 {
	SOLD_OUT, NO_QUATER, HAS_QUATER, SOLD
};

public class GumMachine1 {
	State1 state;
	int count = 0;

	public GumMachine1(int count) {
		state = State1.SOLD_OUT;
		this.count = count;
		if(count>0) {
			state = State1.NO_QUATER;
		}
	}

	public void insertQuater() {
		if(state.equals(State1.NO_QUATER )) {
			state = State1.HAS_QUATER;
			System.out.println("You inserted a quater");
		}else if(state.equals(State1.HAS_QUATER ) ){
			System.out.println("You can not insert another quater");
		}else if(state.equals(State1.SOLD)){
			System.out.println("Please wait... We are already giving you a gumball");
		}else if(state.equals(State1.SOLD_OUT)){
			System.out.println("You can not insert a quater. Machine is sold out");
		}

	}

	public void ejectQuater() {
		if(state.equals(State1.NO_QUATER )) {
			System.out.println("You have not inserted a quater");
		}else if(state.equals(State1.HAS_QUATER ) ){
			state = State1.NO_QUATER;
			System.out.println("Quater Returned");
		}else if(state.equals(State1.SOLD)){
			System.out.println("sorry.. you already turned the crank");
		}else if(state.equals(State1.SOLD_OUT)){
			System.out.println("You can not eject a quater as you have not inserted it");
		}
	}

	public void dispense() {
		if(state.equals(State1.NO_QUATER )) {
			System.out.println("You need to pay first");
		}else if(state.equals(State1.HAS_QUATER ) ){
			System.out.println("No gumball dispensed");
		}else if(state.equals(State1.SOLD_OUT)){
			System.out.println("No gumball dispensed");
		}else if(state.equals(State1.SOLD)){
			System.out.println("A gumball comes rolling from the slot");
			count = count-1;
			if(count == 0){
				System.out.println("Out of gumballs....");
				state=State1.SOLD_OUT;
			}else{
				state = State1.NO_QUATER;
			}
			
		}
	}

	public void turnCrank() {
		if(state.equals(State1.NO_QUATER )) {
			System.out.println("You turned but there is no quater");
		}else if(state.equals(State1.HAS_QUATER ) ){
			state = State1.SOLD;
			dispense();
		}else if(state.equals(State1.SOLD)){
			System.out.println("Turning twice does not  get you another gumball");
		}else if(state.equals(State1.SOLD_OUT)){
			System.out.println("You turned but there is no quater");
		}
	}

}
