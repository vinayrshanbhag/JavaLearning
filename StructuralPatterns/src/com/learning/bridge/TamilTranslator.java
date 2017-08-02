package com.learning.bridge;

public class TamilTranslator implements Translator {

	@Override
	public void translate(String text) {
		if(text.equals("Let me talk about indirections")){
			System.out.println("some tamil translation about indirectionss");
		}
		else{
			System.out.println("tamil translation about testing");
		}
		
	}

}
