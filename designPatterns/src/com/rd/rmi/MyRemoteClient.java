package com.rd.rmi;

import java.rmi.Naming;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go(){
		try{
			MyRemote service = (MyRemote)Naming.lookup("rmi://localhost/service");
			String s = service.sayHello();
			System.out.println("Service says" + s);
			
		}catch(Exception e){
			System.out.println("error");
		}
	}
}
