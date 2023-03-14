package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.naming.InitialContext;

  public class ThrowsKeyword
  {
   void Khan() throws ArithmeticException
{
	 //FileInputStream fis =new FileInputStream("d:abs.text");
	 int a=10;
	 int b=0,c;
	 c=a/b;
	 System.out.println(c);
}

	public void abrar() throws FileNotFoundException
	{
		FileInputStream fis =new FileInputStream("c:Abs.text");
	}
    
     public static void main(String[] args) throws FileNotFoundException
     {
		ThrowsKeyword tk=new ThrowsKeyword();
		
			tk.Khan();
			 tk.abrar();
			
     }

	public void khan() throws ArithmeticException
	{
		int c=100;
		int d=0;
		int e=c/d;
		System.out.println(e);
	}
		
		 
		 
	}

