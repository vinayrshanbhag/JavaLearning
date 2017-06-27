package com.learning.prototypalpattern;

public abstract class Memory {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.getClass().getName();
	}
	
	public abstract Memory makeCopy();
}
