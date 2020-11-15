package com.learning.abstractFactory;

public abstract class ComputerFactory {
	public abstract Computer createCompter();
	public abstract CPU getCPU();
	public abstract Memory getMemory();

}
