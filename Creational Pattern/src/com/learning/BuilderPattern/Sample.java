package com.learning.BuilderPattern;




public class Sample {
	
	public static void main(String[] args) {
		PizzaDirector pizzaDirector = new PizzaDirector();
		PizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();
		pizzaDirector.makePizza(cheesePizzaBuilder);
		System.out.println(cheesePizzaBuilder.create());
		
		
		PizzaBuilder veggiePizzaBuilder = new VeggiePizzaBuilder();
		pizzaDirector.makePizza(veggiePizzaBuilder );
		System.out.println(veggiePizzaBuilder.create());
		
		
	}

}
