package com.learning.BuilderPattern;

import java.util.Arrays;

public class Pizza {

	private Crust _crust;
	private Sauce _sauce;
	private String _cheese;
	private String[] _toppings;
	

	public void createCrust() {
		_crust = new Crust();
		
	}

	public void spreadSauce() {
		_sauce = new Sauce();
		
	}

	public void addCheese() {
		_cheese = "mozarella";
		
	}

	@Override
	public String toString() {
		return "Pizza [_crust=" + _crust + ", _sauce=" + _sauce + ", _cheese=" + _cheese + ", _toppings="
				+ Arrays.toString(_toppings) + "]";
	}

	public void addToppings(String...toppings) {
		_toppings =toppings; 
	}

	public void bake() {
		System.out.println(".. Baking..");
		
	}
	
	
	

}
