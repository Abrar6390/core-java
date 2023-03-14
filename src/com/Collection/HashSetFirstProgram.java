package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetFirstProgram {

	public static void main(String[] args) {
	 TreeSet<Integer>tSet=new TreeSet<>();
	 tSet.add(50);
	 tSet.add(20);
	 tSet.add(40);
	 tSet.add(30);
	 tSet.add(10);
	 System.out.println(tSet);
	      Iterator itr=tSet.iterator();
	      while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	      
		System.out.println("--------------------");
		
		Iterator itrIterator=tSet.descendingIterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
			
		}
	
	}
	
	}

