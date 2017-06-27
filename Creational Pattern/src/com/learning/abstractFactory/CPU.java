package com.learning.abstractFactory;

public abstract class CPU {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s  %d", getClass().getName(), hashCode());
}
	
}
