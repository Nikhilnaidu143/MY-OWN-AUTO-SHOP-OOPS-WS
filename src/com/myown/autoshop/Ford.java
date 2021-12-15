package com.myown.autoshop;

/*** Ford(Sub-Class) which extends Car(Super-Class). ***/
public class Ford extends Car {
	// Instance variables.
	int year;
	int manufactureDiscount;

	/** Parameterized Constructor. **/
	public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufactureDiscount = manufactureDiscount;
	}

	/**
	 * Overriding getSalePrice method to return Sale-Price after giving manufacture
	 * Discount.
	 **/
	@Override
	public double getSalePrice() {
		return regularPrice = regularPrice - manufactureDiscount;
	}
}
