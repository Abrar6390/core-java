package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class KhanAbrar
{
    public  void Abrar() throws ArithmeticException
	 {
		 int a=10;
		 int b=0;
		 int c=a/b;
	    System.out.println(c);
	 }
      public void khan()  throws FileNotFoundException
         {
          FileInputStream  fis=new FileInputStream ("c:abc.text");
          }
   public static void main(String args[]) throws ArithmeticException, FileNotFoundException
   {
     ThrowsKeyword tk=new ThrowsKeyword();
	 tk.abrar();
	 tk.khan();
   } 
   }
