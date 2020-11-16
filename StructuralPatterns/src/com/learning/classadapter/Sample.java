package com.learning.classadapter;

public class Sample {
  
	
	public static void main(String[] args) {
		Computer computer = new Computer(new Memory1());
		computer.work();
		
		Computer computer2 = new Computer(new Memory2Adaptor());
		computer2.work();
	}
}
