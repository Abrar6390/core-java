package com.Collectio;

import java.util.*;
import java.util.stream.Stream;

public class HashMapMethods {

	public static void main(String[] args) {
		Map map=new HashMap<>();
		map.put(1,"Abrar");
		map.put(2,"Shadab");
		map.put(3, "map");
		Map map2=new HashMap<>();
		map2.put(11,"Abrar1");
		map2.put(22,"Shadab2");
		map2.put(33, "map3");
		System.out.println(map);
		System.out.println("--------------------");
		System.out.println(map.isEmpty());
		
		System.out.println(map.entrySet());
		//map.keySet();
		System.out.println(map.keySet());
		map.putAll(map2);
		System.out.println(map2);
		System.out.println(map);
		map.clear();
		System.out.println(map);
		
	}

}
