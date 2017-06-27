package com.learning.prototypalpattern;

public class Computer {

	private Memory _memory;

	public Computer(Computer otherComputer) {
		/*if(otherComputer._memory instanceof Memory1){
			_memory = new Memory1();
		}
		else{
			_memory = new Memory2();
		}
		  */
		
		_memory = otherComputer._memory.makeCopy();
	}
	
	public Computer(Memory memory) {
		_memory = memory;
	}

	@Override
	public String toString() {	
		return String.format("Computer with Memory : %s", _memory);
	}

}
