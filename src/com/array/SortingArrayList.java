package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
	ArrayList array=new ArrayList<>();
	array.add("Khan");
	array.add("Abrar");
	array.add("Shadab");
	array.add("kasim");
	System.out.println(array);
	Collections.sort(array);
	System.out.println(array);
	}

}
