package com.learning.BuilderPattern;

public class  CheesePizzaBuilder extends PizzaBuilder {

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
		getPizza().addToppings("...cheese...	");

	}

	@Override
	public void bake() {
		getPizza().bake();

	}

}
