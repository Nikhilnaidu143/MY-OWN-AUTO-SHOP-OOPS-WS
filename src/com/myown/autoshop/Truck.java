package com.myown.autoshop;

/*** Truck(Sub-Class) which extends Car(Super-Class). ***/
public class Truck extends Car {
	// Instance variable
	int weight;

	/** Parameterized Constructor **/
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	/** Overriding getSalePrice to return Sale-Price after giving Discount. **/
	@Override
	public double getSalePrice() {
		if (weight > 2000) {
			return regularPrice = regularPrice - (regularPrice * 0.10);  // 10% discount i.e., 10/100 = 0.10
		} else {
			return regularPrice = regularPrice - (regularPrice * 0.20);  // 20% discount i.e., 20/100 = 0.20
		}
	}
}
