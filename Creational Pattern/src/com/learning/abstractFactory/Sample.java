package com.learning.abstractFactory;

public class Sample {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Computer computerA = new ComputerA();
		makeComputer(computerA, new ComputerFactoryA());
		System.out.println(computerA);
		
		Computer computerB = new ComputerB();
		makeComputer(computerB, new ComputerFactoryB());
		System.out.println(computerB);
		
		
		
	}

	private static void makeComputer(Computer computer, ComputerFactory computerFactory) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	  computer.addCPU((CPU)Class.forName("com.learning.abstractFactory.CPU" + computer.getPartsType()).newInstance());
	  computer.addMemory((Memory)Class.forName("com.learning.abstractFactory.Memory" + computer.getPartsType()).newInstance());
  }
}
