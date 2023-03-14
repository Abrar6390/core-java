package com.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> m=new HashSet<>();
		m.add("Abrar");
		m.add("Salman");
		m.add("Obaid");
		Set<String>dSet=new HashSet<>(m);
		
		dSet.add("Muzammil");
		Iterator<String> iterator = dSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
			
		}

	}

}
