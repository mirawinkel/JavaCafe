package com.perscholas.cafe;

import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList<Product> myOrder;
	
	
	public ShoppingCart() {
		this.myOrder = new ArrayList<Product>();
	}
	
	public void addCoffee(int quantity) {	
		Coffee coffee = new Coffee(quantity);
		coffee.addOptions();
		coffee.calculateProductTotal();
		myOrder.add(coffee);
	}
	public void addEspresso(int quantity) {	
		Espresso espresso = new Espresso(quantity);
		espresso.addOptions();
		espresso.calculateProductTotal();
		myOrder.add(espresso);
	}
	public void addCappuccino(int quantity) {	
		Cappuccino cappuccino = new Cappuccino(quantity);
		cappuccino.addOptions();
		cappuccino.calculateProductTotal();
		myOrder.add(cappuccino);
	}

	public ArrayList<Product> getMyOrder() {
		return myOrder;
	}

	public void setMyOrder(ArrayList<Product> myOrder) {
		this.myOrder = myOrder;
	}
}
