package com.Collectio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapMethods2 {

	public static void main(String[] args) {
		
		 Map map=new HashMap<>(); 
		 map.put(101,"shadab"); 
		 map.put(102,"Abrar");
		  map.put(103,"kasim");
		  map.put(104,"obaid");
		  
		  Map map2=new HashMap<>(); 
		  map2.put(101,"shadab");
		  map2.put(102,"Abrar");
		 map2.put(103,"kasim");
		 map2.put(104,"obaid");
		  
		  System.out.println(map); System.out.println("------------");
		  System.out.println(map.containsKey(101));
		  System.out.println("========================");
		  System.out.println(map.containsValue("Abrar"));
		  System.out.println("______________________");
		 System.out.println(map.equals(map));; System.out.println(map.size());
		 
	
	
	}

}
