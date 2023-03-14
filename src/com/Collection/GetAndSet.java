package com.Collection;

import java.util.ArrayList;

public class GetAndSet {

	public static void main(String[] args) {
		ArrayList<String > list=new ArrayList<>();
		list.add("Banana");
		list.add("apple");
		list.add("carry");
		list.add("pinapple");
		System.out.println("list get "+list.get(0));
		list.add("khan");
		for(String str:list)
		{
			System.out.println(str);
		}
	}

}
