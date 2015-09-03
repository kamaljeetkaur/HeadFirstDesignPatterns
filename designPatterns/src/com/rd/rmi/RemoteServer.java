package com.rd.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class RemoteServer {
	public static void main(String[] args) {
		try{
			System.setSecurityManager(new RMISecurityManager());
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("rmi://127.0.0.1:8080/service", service);
			System.out.println("Server is ready");
		}catch(Exception e){
			System.out.println("error in server ");
		}
	}

}
