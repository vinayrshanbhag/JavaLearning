package com.learning.bridge;

public class Arhitect extends Expert{

	@Override
	public void talk() {
		get_translator().translate("Let me talk about the evolvind design");
		
	}

}
