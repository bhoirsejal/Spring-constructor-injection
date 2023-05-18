package com.jsp.demo;

public class Pen {
	
	String brand;
	String color;
	int price;
	
	
	
	public Pen(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}



	public void print() {
		System.out.println("brand is "+brand);
		System.out.println("color is "+color);
		System.out.println("price is "+price);
		
	}

}
