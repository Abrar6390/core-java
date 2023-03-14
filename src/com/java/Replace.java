package com.java;

public class Replace {

	public static void main(String[] args) {
		String s=" that is abrar";
		
		  System.out.println(s.replace("a", "A"));
		  System.out.println(s.replaceFirst("a", "A"));
		  System.out.println(s.replaceAll("a", "A"));
		 
        System.out.println(s.replace("is(.)", "was"));
        System.out.println(s.replaceAll("a(.*)","A"));
       
	}

}
