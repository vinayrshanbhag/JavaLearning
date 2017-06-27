package com.learning.SingleTonPattern;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
	public static void main(String[] args) {
		DBManager dbManager = DBManager.INSTANCE;
		System.out.println(dbManager);
		
	}
	
	
	
}
