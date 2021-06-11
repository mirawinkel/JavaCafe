package com.perscholas.cafe;

import java.util.Scanner;

public abstract class Product {
	String name;
	double price;
	int quantity;
	static Scanner sc = new Scanner(System.in);
	
	public Product(int quantity) {
		this.quantity = quantity;
	}
	
	public abstract double calculateProductTotal();
	public abstract void addOptions();
	public abstract void printOptions();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
