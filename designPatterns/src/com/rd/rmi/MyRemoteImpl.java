package com.rd.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyRemoteImpl() throws RemoteException {
		super();
	}

	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello RMI";
	}
	

}
