package com.learning.bridge;

public class SpanishTranslator implements Translator {

	@Override
	public void translate(String text) {
		if(text.equals("Let me talk about indirections")){
			System.out.println("some spanish translation about indirectionss");
		}
		
		else{
		    System.out.println("Spanish translation about testing");			
		}
		
		
	}

}
