package com.Collection;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.security.auth.login.FailedLoginException;

public class ConcurentHashMapProgram{

	public static void main(String[] args) {
	Map <String,String>map=new ConcurrentHashMap<>();
	map.put("01","Abrar");
	map.put("khan","02");
	map.put("03","Shadab");
	System.out.println(map);
	for(Map.Entry<String, String> set :map.entrySet())
	{
		map.put("llll", "null");//fail Fast
		System.out.println(set.getKey()+" "+set.getValue());
		System.out.println(set.getKey()+"  "+set.getValue());
	}
	System.out.println(map);//fail save
	}
}


