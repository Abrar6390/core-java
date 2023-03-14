package com.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UseMethodsHashMap {

	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "r");
		System.out.println(map);
		Set set = map.keySet();
		System.out.println(set);
		Collection collection = map.values();
		System.out.println(collection);
		Set set1 = map.entrySet();
		Iterator itr = set1.iterator();
		while (itr.hasNext()) {
			if(set1.equals("A"))
			{
				
			}
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry);
		}
	}
}
