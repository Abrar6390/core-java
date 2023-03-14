package com.array;

public class Abc {
	static int a = 30;

	public static void main(String[] args) {
		System.out.println("ooooooooooooooooo");

	}

	static {
		int b = 10;
		int c = 20;
		int d = 0;

		System.out.println(" ");       
		{
			d = a + b + c;
			System.out.println(d);
		}
	}
	{

	}

}
