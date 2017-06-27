package com.learning.prototypalpattern;

public class Sample {
      public static void main(String[] args) {
		Computer computer1 = new Computer(new Memory1());
		System.out.println(computer1);
		
		Computer computer2 = new Computer(computer1);
		System.out.println(computer2);
		
		
	}
}
