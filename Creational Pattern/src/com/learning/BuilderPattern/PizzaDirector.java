package com.learning.BuilderPattern;

public class PizzaDirector {
	public void makePizza(PizzaBuilder pizzaBuilder){
		System.out.println("Creating the crust");
		pizzaBuilder.createCrust();
		System.out.println("Spreading the sauce");
		pizzaBuilder.spreadSauce();
		System.out.println("Adding cheese");
		pizzaBuilder.addCheese();
		System.out.println("adding topings");
		pizzaBuilder.addToppings("Cheese");
		System.out.println("...baking..");
		pizzaBuilder.bake();
		
		
	}
}
