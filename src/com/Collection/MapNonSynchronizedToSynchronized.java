package com.Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapNonSynchronizedToSynchronized {

	public static void main(String[] args) {
		HashMap<String,String>map=new HashMap<>();//Non-Synchronized
	    Map  m1= Collections.synchronizedMap(map);//Synchronized
		map.put("11","Abrar");
		map.put("22","Ahmad");
		map.put("33","khan");
		map.put("44","shadab");
		System.out.println(map);//this is not thread safe
		//Map  m1= Collections.synchronizedMap(map);
		System.out.println(m1);
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m);
		}
	}

}
