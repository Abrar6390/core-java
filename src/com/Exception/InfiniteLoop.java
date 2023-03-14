package com.Exception;


public class InfiniteLoop {
	   void add()
	  {
		  show();
	  System.out.println("a");
	  }
	 static  void show()
	  {
		  //add();
		  System.out.println("b");
	  }
	  public static void main(String...args)
	{
		  InfiniteLoop sd=new InfiniteLoop(); 
	    //sd.add();
	    //show();
	}
	}
