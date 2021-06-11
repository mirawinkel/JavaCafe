package com.perscholas.cafe;

public class Espresso extends Product {
	
	boolean extraShot;
	boolean macchiato;
	
	public Espresso(int quantity) {
		super(quantity);
		this.name = "espresso";
		this.price = 3.50;
		this.extraShot = false;
		this.macchiato = false;
	}

	@Override
	public double calculateProductTotal() {
		if(this.extraShot) {
			this.price = this.price + 2.00;
		}
		if(this.macchiato) {
			this.price = this.price + 1.00;
		}
		return this.quantity * this.price;
	}

	@Override
	public void addOptions() {
		System.out.println("Would you like to add an extra shot for $2.00 Y/N?");
		String reply = sc.next();
		if (reply.contentEquals("y") || reply.contentEquals("Y")) {
			this.extraShot = true;
		}
		System.out.println("Would you like to add a dallop of foam for $1.00 Y/N?");
		reply = sc.next();
		if (reply.contentEquals("y") || reply.contentEquals("Y")) {
			this.macchiato = true;
		}
	}
	
	@Override
	public void printOptions() {
		System.out.println(this.quantity + " " + this.name + " " + "with extra shot: " + this.extraShot + "   as macchiato: " + this.macchiato + "  totaling $" + (this.quantity*this.price));
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

}
