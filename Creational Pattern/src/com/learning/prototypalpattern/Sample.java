package com.learning.prototypalpattern;

public class Sample {
      public static void main(String[] args) {
		Computer computer1 = new Computer(new Memory1());
		Computer computer2 = new Computer(new Memory2());
		System.out.println(makeCopyOf(computer1));
		System.out.println(makeCopyOf(computer2));

		
	}

	public static Computer makeCopyOf(Computer computer){
      	return computer.makeCopy(computer);
	}
}
