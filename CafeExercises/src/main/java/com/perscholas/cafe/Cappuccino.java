package com.perscholas.cafe;

public class Cappuccino extends Product {
	
	boolean peppermint;
	boolean whipCream;
	
	public Cappuccino(int quantity) {
		super(quantity);
		this.name = "cappuccino";
		this.price = 4.50;
		this.peppermint = false;
		this.whipCream = false;
	}

	@Override
	public double calculateProductTotal() {
		if(this.peppermint) {
			this.price = this.price + 2.00;
		}
		if(this.whipCream) {
			this.price = this.price + 1.00;
		}
		return this.quantity * this.price;
	}

	@Override
	public void addOptions() {
		System.out.println("Would you like to add peppermint syrup for $2.00 Y/N?");
		String reply = sc.next();
		if (reply.contentEquals("y") || reply.contentEquals("Y")) {
			this.peppermint = true;
		}
		System.out.println("Would you like to add whip cream for $1.00 Y/N?");
		reply = sc.next();
		if (reply.contentEquals("y") || reply.contentEquals("Y")) {
			this.whipCream = true;
		}
	}

	@Override
	public void printOptions() {
		System.out.println(this.quantity + " " + this.name + " " + "with peppermint syrup: " + this.peppermint + "   with whip cream: " + this.whipCream + "  totaling $" + (this.quantity*this.price));
	}

	public boolean isPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhipCream() {
		return whipCream;
	}

	public void setWhipCream(boolean whipCream) {
		this.whipCream = whipCream;
	}

}
