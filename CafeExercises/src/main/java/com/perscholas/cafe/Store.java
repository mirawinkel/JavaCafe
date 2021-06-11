package com.perscholas.cafe;

public class Store {
	
	public Store() {
		
	}
	
	public void displayMenu() {
		System.out.println("Please select from the following menu:");
		System.out.println("1: Coffee");
		System.out.println("2: Espresso");
		System.out.println("3: Cappuccino");
		System.out.println("4: Checkout");
	}
	
	public void processOrder(double subtotal) {
		
		double tax = .1;
		double withTax = (Math.ceil((subtotal* tax)*100))/100;
		double total = (Math.ceil((subtotal + withTax)*100))/100;
		
		System.out.println();
		System.out.println("Your order subtotal is $" + subtotal);
		System.out.println("Tax for your order is $" + withTax);
		System.out.println("Bringing your total order to $" + total);
	}
	
}
