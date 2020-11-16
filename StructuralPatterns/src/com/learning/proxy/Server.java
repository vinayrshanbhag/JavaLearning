package com.learning.proxy;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		Server server = new Server();
		System.setProperty("java.rmi.server.hostname", "127.0.0.1");
		Remote remote =null;/*UnicastRemoteObject.exportObject(server,8002);*/
		Registry registry =LocateRegistry.createRegistry(8002);
		registry.bind("Server", remote);
		System.out.println("Server running");
	}


	public String greet(String name) throws RemoteException {
		System.out.println("Greeting...");
		return "Hello" + name;
	}

}
