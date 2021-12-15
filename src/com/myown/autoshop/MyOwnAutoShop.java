package com.myown.autoshop;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		System.out.println("--------------MY-OWN-AUTO-SHOP---------------");
		
		/** Creating Instance and displaying Sale-Price for Sedan. **/
		Sedan sedan = new Sedan(120, 600000, "BLACK", 90);
		System.out.println("\nSedan Sale Price :- " + sedan.getSalePrice());

		/** Creating Instance and displaying Sale-Price for ford1 and ford2. **/
		Ford ford1 = new Ford(140, 1000000, "GREEN", 2021, 10000);
		System.out.println("\nFord-1 Sale Price :- " + ford1.getSalePrice());

		Ford ford2 = new Ford(100, 700000, "RED", 2019, 15000);
		System.out.println("\nFord-2 Sale Price :- " + ford2.getSalePrice());

		/** Creating Instance and displaying Sale-Price for Car. **/
		Car car = new Car(100, 500000, "RED");
		System.out.println("\nCar Sale Price :- " + car.getSalePrice());

		/** Creating Instance and displaying Sale-Price for Truck. **/
		Truck truck = new Truck(150, 5000000, "YELLOW", 1500);
		System.out.println("\nTruck Sale Price :- " + truck.getSalePrice());
	}
}
