package com.learning.abstractFactory;

public class ComputerFactoryB extends ComputerFactory {

	@Override
	public Computer createCompter() {
		return new ComputerB();
	}

	@Override
	public CPU getCPU() {
		return new CPUB();
	}

	@Override
	public Memory getMemory() {
		return new MemoryB();
	}

}
