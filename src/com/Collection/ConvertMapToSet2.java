package com.Collection;

import java.util.*;

public class ConvertMapToSet2 {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1,"1:-khan");
		map.put(2,"2:-Abrar");
		map.put(3,"3:-Shadab");
		System.out.println(map);
		
		System.out.println("--------------------");
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry=(Map.Entry)  itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
			}

}
