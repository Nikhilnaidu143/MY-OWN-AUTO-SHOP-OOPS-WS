package com.myown.autoshop;

/*** Sedan(Sub-Class) which extends Car(Super-Class). ***/
public class Sedan extends Car {
	// Instance Variable
	int length;

	/** Parameterized Constructor. **/
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	/** Overriding getSalePrice to return sale-price after giving discount. **/
	@Override
	public double getSalePrice() {
		double discount;
		if (length > 20) {
			return regularPrice = regularPrice - (regularPrice * 0.05);  // 5% discount i.e., 5/100 = 0.05.
		} else {
			return regularPrice = regularPrice - (regularPrice * 0.10);  // 10% discount i.e., 5/100 = 0.10.
		}
	}
}
