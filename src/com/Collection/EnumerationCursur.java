package com.Collection;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationCursur {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s);
        Enumeration<Integer> ec=s.elements();
        while (ec.hasMoreElements()) {
			System.out.println(ec.nextElement());
		}	
		}
	}
