package com.java;

import org.w3c.dom.ls.LSOutput;

public class IndexOf {
	public static void main(String[] args) {
		String str="adil";
		String str2 ="abrar";
		str=str+str2;//9
		//str2=str.substring(0,str.length()-str2.length());
		//str=str.substring(str2.length());
		//System.out.println(" str2 name is :"+str2);
		//System.out.println(" str name is :"+str);
		
		str=str2.substring(4, 9);
		System.out.println(str);
		str2=str2.substring(0);
		System.out.println(str2);
		
			
		}
	}