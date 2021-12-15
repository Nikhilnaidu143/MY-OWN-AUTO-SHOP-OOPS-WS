package com.myown.autoshop;

public class Car {
	// Instance variables
	int speed;
	double regularPrice;
	String color;

	/** Parameterized Constructor. **/
	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	/** getSalePrice method to return sale-price **/
	public double getSalePrice() {
		return regularPrice;
	}
}
