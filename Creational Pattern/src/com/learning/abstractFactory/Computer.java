package com.learning.abstractFactory;

public abstract class Computer {
	
	protected CPU cpu;
	
	protected Memory memory;

	public  void addMemory(Memory memory){
		this.memory = memory;
	}
	
	public  void addCPU(CPU cpu){
		 this.cpu = cpu;
	}
	
	public abstract String getPartsType();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s, %s,%s", getClass().getName(),cpu, memory);
	}

	

}
