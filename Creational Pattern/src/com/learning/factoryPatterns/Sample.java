package com.learning.factoryPatterns;

public class Sample {
	public static void main(String[] args) {
		
		
		Developer developer = new Developer();		
		prepareEmployeeForTravel(developer);
		System.out.println(developer);
		
		SalesExecutive salesExecutive = new SalesExecutive();
		prepareEmployeeForTravel(salesExecutive);
		System.out.println(salesExecutive);
	}
	
	
	public static void prepareEmployeeForTravel(Employee employee){
		employee.getReadyForTravel();
		
	}
}
	
