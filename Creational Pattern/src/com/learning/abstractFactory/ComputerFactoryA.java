package com.learning.abstractFactory;

public class ComputerFactoryA extends ComputerFactory {

	@Override
	public Computer createCompter() {
		return new ComputerA();
	}

	@Override


	public CPU getCPU() {
		// TODO Auto-generated method stub
		return new CPUA();
	}

	@Override
	public Memory getMemory() {
		// TODO Auto-generated method stub
		return new MemoryA();
	}

}
