package com.learning.SingleTonPattern;


enum DBManager
{
	INSTANCE;

	public void getConnections() {
		System.out.println("Inside getConnections..");
	}

	public String toString() {
		return String.format("%s %d", getClass().getName(), hashCode());
	}
}

public class Sample {
	public static void main(String[] args) {
		DBManager dbManager =  DBManager.INSTANCE;
		DBManager dbManager1 = DBManager.INSTANCE;
		System.out.println(dbManager);
		System.out.println(dbManager1);
		dbManager.getConnections();
	}
}
