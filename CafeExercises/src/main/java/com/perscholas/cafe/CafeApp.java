package com.perscholas.cafe;

import java.util.Scanner;

class CafeApp {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		Store cafe = new Store(); 
		ShoppingCart order = new ShoppingCart();
		
		System.out.println("Welcome to the Per Scholas Cafe!");
		System.out.println();
		boolean ordering = true;
		
		while(ordering) {
			cafe.displayMenu();
			int choice = s.nextInt();
			if (choice==4) {
				ordering = false;
				break;
			}
			System.out.println("How many would you like?");
			int num = s.nextInt();
			if (choice==1) {
				order.addCoffee(num);
			} else if (choice==2) {
				order.addEspresso(num);
			} else if (choice==3) {
				order.addCappuccino(num);
			} else {
				System.out.println("Selection not recognized, please try again");
			}
		}
		
		double total = 0;
		for (Product item : order.myOrder) {
			total = total + (item.price * item.quantity);
			item.printOptions();
		}
		
		cafe.processOrder(total);
	}
}
