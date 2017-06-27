package com.learning.abstractFactory;

public class ComputerFactoryB extends ComputerFactory {

	@Override
	public CPU getCPU() {
		return new CPUB();
	}

	@Override
	public Memory getMemory() {
		return new MemoryB();
	}

}
