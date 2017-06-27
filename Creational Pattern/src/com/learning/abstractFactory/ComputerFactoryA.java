package com.learning.abstractFactory;

public class ComputerFactoryA extends ComputerFactory {

	@Override
	public CPU getCPU() {
		// TODO Auto-generated method stub
		return new CPUA();
	}

	@Override
	public Memory getMemory() {
		// TODO Auto-generated method stub
		return new MemoryB();
	}

}
