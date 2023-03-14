package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class DiffrentSet {

	public static void main(String[] args)
	{
		
		Set<Integer> s=new HashSet();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(null);
        s.add(null);
        s.add(200);
        s.add(300);
        System.out.println(s);
        Iterator itr=s.iterator();
        while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
        }
}
