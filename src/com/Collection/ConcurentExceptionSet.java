package com.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ConcurentExceptionSet {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		System.out.println(set);
		Iterator itr=set.iterator();
		while (itr.hasNext()) {
			
			set.remove(11);
			System.out.println(itr.next());
		}
		System.out.println(set);
	}

}
