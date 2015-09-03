package com.rd.proxy; 
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
 
public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
		super();
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException{
		try{
			String methodName = method.getName();
			if(methodName.startsWith("set")) {
				return method.invoke(person,args);
			} else if(methodName.startsWith("get")){
				return method.invoke(person, args);
			} else if(methodName.startsWith("setHotOrNotRating")){
				throw new IllegalAccessException();
			}
		}catch(InvocationTargetException ex){
			System.out.println(ex);
		}
		
		return null;
	} 
	
}
