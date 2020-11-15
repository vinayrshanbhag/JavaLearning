package com.learning.abstractFactory;

public class Sample {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		ComputerFactory computerFactoryA = new ComputerFactoryA();
		Computer computerA = computerFactoryA.createCompter();

		makeComputer(computerA, computerFactoryA);
		System.out.println(computerA);

		ComputerFactory computerFactoryB = new ComputerFactoryB();
		Computer computerB = computerFactoryB.createCompter();
		makeComputer(computerB,computerFactoryB);
		System.out.println(computerB);
	}

	private static void makeComputer(Computer computer, ComputerFactory computerFactory) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	  computer.addCPU(computerFactory.getCPU());
	  computer.addMemory(computerFactory.getMemory());

	  //If the language provides the reflection capability,
//	  computer.addCPU((CPU)Class.forName("com.learning.abstractFactory.CPU" + computer.getPartsType()).newInstance());
//	  computer.addMemory((Memory)Class.forName("com.learning.abstractFactory.Memory" + computer.getPartsType()).newInstance());
  }
}
