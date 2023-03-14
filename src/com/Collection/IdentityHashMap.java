package com.Collection;

import java.util.HashMap;

public class IdentityHashMap {

	public static void main(String[] args) {
		HashMap map=new HashMap<>();
		Integer i=new Integer(10);
		Integer i2=new Integer(10);
		map.put(i,"Abrar");
		map.put(i2,"Khan");
		System.out.println(map);
	}

}
