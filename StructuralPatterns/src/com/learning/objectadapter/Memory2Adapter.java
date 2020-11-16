package com.learning.objectadapter;

public class Memory2Adapter implements Memory {

	private Memory2 _memory2;

	public Memory2Adapter(Memory2 memory2){
        _memory2=memory2;
	}

	@Override
	public void store(int address, byte bytes) {
		_memory2.setAddr(address);
		_memory2.write(bytes);

	}

}
