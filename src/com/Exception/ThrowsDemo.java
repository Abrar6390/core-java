package com.Exception;

public class ThrowsDemo {

	public static void main(String[] args) throws IllegalAccessException {
		
		int a=30;
		int b=0;
		
		//String string=null;
		//System.out.println(c);
		//System.out.println(string.length());
		
		if(a==b)
		{
		System.out.println("condtion matched");	
		}
		else {
			throw new IllegalAccessException("condision not matchede");
		}
	}

}
