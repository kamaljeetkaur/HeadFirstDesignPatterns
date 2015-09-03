package com.rd.template;

public class BeverageImpl {
		public static void main(String[] args) {
			Tea tea = new Tea();
			System.out.println("Preparing tea");
			tea.prepareRecipe();
			
			Coffee coffee = new Coffee();
			System.out.println("Preparing Coffee");
			coffee.prepareRecipe();
			
			
		}

}
