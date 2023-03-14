package com.Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		String string = "abrar";
		Set<Character> set = new LinkedHashSet();
		System.out.println("These are duplicate character in given string - ");
		for (int i = 0; i < string.length(); i++) {
			if (!set.add(string.charAt(i))) {
				// set.add(string.charAt(i));
				System.out.print(string.charAt(i));
				 break;
			}
		}
		System.out.println();
		System.out.print("String after removing duplicate - " + set);
	}

}
