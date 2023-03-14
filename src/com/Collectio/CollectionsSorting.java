package com.Collectio;

import java.util.*;

public class CollectionsSorting 
{
	public static void main(String[] args) 
	{
		List list = new ArrayList<>();
		list.add("khan");
		list.add("Abrar");
		list.add("yasir");
		list.add("Shadab");
		System.out.println(list);
		Collections.sort(list);
		Iterator itr = list.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------");
		
		Collections.sort(list, Collections.reverseOrder());
		Iterator itr2 = list.iterator();
		while (itr2.hasNext())
		{
			System.out.println(itr2.next());

		}
	}

}
