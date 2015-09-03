package com.rd.proxy;

import java.lang.reflect.*;
import java.util.*;

public class MatchMakingTestDrive {
	Map<String,PersonBean> dbEntry = new HashMap<String,PersonBean>();
	
	MatchMakingTestDrive() {
		initialiseDatabase();
	}
	
	public static void main(String[] args) {
		MatchMakingTestDrive makingTestDrive = new MatchMakingTestDrive();
		makingTestDrive.testDrive();
		
	}
	
	void initialiseDatabase() {
		PersonBean p1 = createPerson(6,"Kamal Kaur", "Shopping,Music","Female");
		PersonBean p2 = createPerson(9,"Arvind Gupta", "Cars,Music","Male");
		dbEntry.put(p1.getName(),p1);
		dbEntry.put(p2.getName(),p2);
	}
	
	private PersonBean createPerson(int rating, String name, String interests,String gender) {
		PersonBean person = new PersonBeanImpl();
		person.setGender(gender);
		person.setName(name);
		person.setInterests(interests);
		person.setHotOrNotRating(rating);
		return person;
	}
	
	private PersonBean getPerson(String name){
		return dbEntry.get(name);
	}

	private void testDrive() {
		PersonBean person1 = getPerson("Kamal Kaur");
		PersonBean ownerProxy = getOwnerProxy(person1);
		System.out.println("Name is " + ownerProxy.getName());
		changePersonBean(ownerProxy, "Lotus", 8, "Singing");
		
		System.out.println("Gender ----"+ ownerProxy.getGender());
		System.out.println("Name set from owner proxy");
		System.out.println("Name ----"+ ownerProxy.getName());
		System.out.println("Interests set from owner proxy");
		System.out.println("Interests ----"+ownerProxy.getInterests());
		System.out.println("Ratings set from owner proxy");
		System.out.println("Ratings------"+ownerProxy.getHotOrNotRating());
		
		PersonBean person2 = getPerson("Arvind Gupta");
		PersonBean nonOwnerProxy = getNonOwnerProxy(person2);
		changePersonBean(nonOwnerProxy, "Arv Gupta", 10, "Reading");
		

		System.out.println("Gender ----"+ nonOwnerProxy.getGender());
		System.out.println("Name set from non owner proxy");
		System.out.println("Name ----"+ nonOwnerProxy.getName());
		System.out.println("Interests set from non owner proxy");
		System.out.println("Interests ----"+nonOwnerProxy.getInterests());
		System.out.println("Ratings set from non owner proxy");
		System.out.println("Ratings------"+nonOwnerProxy.getHotOrNotRating());
	}
	
	private void changePersonBean(PersonBean proxy,String name, int rating , String interests) {
		try {
		proxy.setHotOrNotRating(rating);
		} catch (Exception e) {
			System.out.println("Can't set Rating from owner proxy");
		}
		try {
			proxy.setName(name);
			proxy.setInterests(interests);
		} catch (Exception e) {
			System.out.println("Can't set name/interests from non owner proxy");
		}
		//proxy.setInterests(interests);
	}

	private PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance
				(PersonBean.class.getClassLoader(),person.getClass().getInterfaces(),new OwnerInvocationHandler(person));
	}
	
	private PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance
				(person.getClass().getClassLoader(),person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
		
	
}
