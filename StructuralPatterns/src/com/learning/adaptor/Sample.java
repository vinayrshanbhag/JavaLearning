package com.learning.adaptor;

public class Sample {
  
	
	public static void main(String[] args) {
		Computer computer = new Computer(new Memory1());
		computer.work();
		
		Computer computer2 = new Computer(new Memory2Adaptor1());
		computer2.work();
		
		Computer computer3 = new Computer(new Memory2Adaptor(new Memory2()));
	}
}
