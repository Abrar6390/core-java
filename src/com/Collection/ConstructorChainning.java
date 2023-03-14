package com.Collection;

public class ConstructorChainning {

	ConstructorChainning()
	{
		this(10);
		System.out.println("hello Abrar");
	}
	ConstructorChainning(int a,String b)
	{
		
		System.out.println("hello Abrar Khan");
	}
	ConstructorChainning(int a)
	{
		
		System.out.println("hii Abrar");
	}
	public static void main(String[] args) {
		
		ConstructorChainning con = new ConstructorChainning();
	}
}
