package com.Collectio;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.*;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		System.out.println(list);
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
	}

}
