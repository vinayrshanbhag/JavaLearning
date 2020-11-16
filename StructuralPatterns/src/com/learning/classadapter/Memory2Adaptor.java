package com.learning.classadapter;

public class Memory2Adaptor extends Memory2 implements Memory {


	@Override
	public void store(int address, byte bytes) {
		super.setAddr(address);
		super.write(bytes);

	}

}
