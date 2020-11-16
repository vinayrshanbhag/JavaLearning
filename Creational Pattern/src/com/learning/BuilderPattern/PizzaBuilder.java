package com.learning.BuilderPattern;

public abstract class PizzaBuilder {
	
	private Pizza pizza = new Pizza();

	

	public abstract void createCrust();

	public abstract void spreadSauce(); 

	public abstract void addCheese();

	public abstract void addToppings(String... Toppings); 

	public abstract void bake();

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public Pizza create(){
		return pizza;
	}
	
	

}
