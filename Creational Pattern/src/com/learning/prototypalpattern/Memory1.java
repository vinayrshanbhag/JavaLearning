package com.learning.prototypalpattern;

public class Memory1 extends Memory {

	@Override
	public Memory makeCopy() {
		return new Memory1();
	}
	
}
