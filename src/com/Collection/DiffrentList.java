package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiffrentList {

	public static void main(String[] args) {
		List l=new ArrayList();
         l.add(10);
         l.add(20);
         l.add(50);
         l.add(40);
         l.add(null);
         l.add(null);
         l.add(10);
         l.add(20);
         System.out.println(l);
         Iterator itr=l.iterator();
         while (itr.hasNext()) {
			
        	 System.out.println(itr.next());	
		}
	}

}
