package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer> abrarSet=new TreeSet<>();
		abrarSet.add(10);
		abrarSet.add(30);
		abrarSet.add(90);
		abrarSet.add(20);
		System.out.println(abrarSet);
		
		System.out.println("--------------");
		 
		System.out.println(abrarSet.pollLast());
		System.out.println(abrarSet.pollFirst());
		
		System.out.println("____________________________");
		
		Iterator iterator=abrarSet.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
			//System.out.println("++++++++++++++++");
		
		System.out.println("________________________");
		
		System.out.println(abrarSet.descendingSet());
      
		System.out.println("++++++++++++++++");
		
		abrarSet.floor(90);
		System.out.println(abrarSet);
	}

}
