package com.Collectio;

import java.util.*;
import java.util.ListIterator;

public class ListIteratorProgram {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(17);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		ListIterator itr=al.listIterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println(" ---------------");
	    
		while (itr.hasPrevious()) 
		{
			System.out.println(itr.previous());
		}
	}
}
