package com.perscholas.cafe;

public class Coffee extends Product{
	
	boolean sugar;
	boolean milk;
	
	public Coffee(int quantity) {
		super(quantity);
		this.name = "coffee";
		this.price = 2.50;
		this.sugar = false;
		this.milk = false;
	}

	@Override
	public double calculateProductTotal() {
		return this.quantity * this.price;
	}
	
	@Override
	public void addOptions() {
		System.out.println("Would you like to add sugar Y/N?");
		String reply = sc.next();
		if (reply.contentEquals("y") || reply.contentEquals("Y")) {
			this.sugar = true;
		}
		System.out.println("Would you like to add milk Y/N?");
		reply = sc.next();
		if (reply.contentEquals("y") || reply.contentEquals("Y")) {
			this.milk = true;
		}
	}

	@Override
	public void printOptions() {
		System.out.println(this.quantity + " " + this.name + " " + "with sugar: " + this.sugar + "   with milk: " + this.milk + "  totaling $" + (this.quantity*this.price));
	}

	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

}
