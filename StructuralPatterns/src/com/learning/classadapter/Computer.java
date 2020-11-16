package com.learning.classadapter;

public class Computer {

	private Memory _memory;

	public Computer(Memory memory) {
		_memory = memory;
	}

	public void work() {
		_memory.store(11111, (byte)0);
	}

}
