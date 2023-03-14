package com.Exception;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class  YoungerAgeException extends RuntimeException
{
	 YoungerAgeException(String s)
	 {
		 super(s);
	 }
}
  class Test
  {
	  public static void main(String[] args)
	  {
	  int age=21;
		  if(age<18)
		  {
			  throw new  YoungerAgeException("not eligible for vote");
		  }
		  else {
			System.out.println("eligible for vote ");
		}
		  }
  }