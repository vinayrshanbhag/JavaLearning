package com.learning.objectadapter;

public class Memory1 implements Memory {

	@Override
	public void store(int address, byte bytes) {
		System.out.println("Memory address and bytes Added from memory1");
		
	}

}
