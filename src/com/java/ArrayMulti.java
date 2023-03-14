package com.java;

public class ArrayMulti {

	public static void main(String[] args) {
		int a[]= {1,4,10,5,15,78,90,57,59,34};
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		{
			System.out.println("even number"+" "+a[i]);
		}
		else 
		{
			System.out.println("odd number"+" "+a[i]);
		}
		
	}
	}
}
