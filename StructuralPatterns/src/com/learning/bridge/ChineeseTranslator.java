package com.learning.bridge;

public class ChineeseTranslator implements Translator {

	@Override
	public void translate(String text) {
		if(text.equals("Let me talk about indirections")){
			System.out.println("some Chineese translation about indirectionss");
		}
		else{
			System.out.println("Chineese translation about testing");
		}
		
	}

}
