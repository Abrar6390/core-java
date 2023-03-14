package com.Collectio;
import java.util.*;
public class IdentityHashMapMethods {

	public static void main(String[] args) {
		IdentityHashMap idm=new IdentityHashMap();
		idm.put(1,"Abrar");
		idm.put(2,"Shadab");
		idm.put(3,"Ayaz");
		idm.put(4,"obaid");
		idm.put(5,"salman");
		Integer i=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i==i2);
		System.out.println(i);
		System.out.println(".equal opr chech contains:-"+i.equals(i2));
		System.out.println(i2);
		System.out.println("-----------------");
		System.out.println("containsKey:-"+idm.containsKey(2));
		System.out.println("containsValue:-"+idm.containsValue("Shadab"));
		
	}

}
