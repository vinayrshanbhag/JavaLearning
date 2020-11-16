package com.learning.classadapter;

public class Memory1 implements Memory {

	@Override
	public void store(int address, byte bytes) {
		System.out.println("Memory Added..");
		
	}

}
