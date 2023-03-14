package com.Collection;

public class MethodChainning {
      
	void m1()
	{
		m2();
		m3();
		m4();
		m5();
		m6();
		System.out.println("1");
	}
	void m2()
	{
		System.out.println("2");
	}
	void m3()
	{
		System.out.println("3");
	}
	void m4()
	{
		System.out.println("4");
	}
	void m5()
	{
		System.out.println("5");
	}
	void m6()
	{
		System.out.println("6");
	}
	
	public static void main(String[] args) {
		MethodChainning chainning=new MethodChainning();
		chainning.m1();
		
	}

}
