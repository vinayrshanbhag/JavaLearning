package com.learning.BuilderPattern;

public class VeggiePizzaBuilder extends PizzaBuilder {

	@Override
	public void createCrust() {
		getPizza().createCrust();

	}

	@Override
	public void spreadSauce() {
		getPizza().spreadSauce();

	}

	@Override
	public void addCheese() {
		getPizza().addCheese();
	}

	@Override
	public void addToppings(String... Toppings) {
		getPizza().addToppings("Onions","Olives","Tomatoes");

	}

	@Override
	public void bake() {
	   getPizza().bake();

	}

}
