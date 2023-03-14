package com.java;

public class SubString {

	public static void main(String[] args) {
   
		String s="javatpoint";
		String s2="html";
		String s3="javaScript";
		s=s+s2+s3;
		s2=s.substring(0,s.length()-s2.length()+s3.length());//s2=javatpoint
		s3=s3+s;
		s=s3.substring(0,s3.length()-s.length());
		s3=s3.substring(s.length());
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
}
}