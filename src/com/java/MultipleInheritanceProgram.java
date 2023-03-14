package com.java;
  class I1
  {
	  void show()
	  {
		  System.out.println("hiii");
	  }
  }
class I2
{
	void show()
	{
		System.out.println("hello");
	}
}
  
public class MultipleInheritanceProgram extends I1
{
       void show()
      {
    	  System.out.println("hello Mulriple Inheritance");
      }
     
      
	public static void main(String[] args) {
		
		I1 mip=new MultipleInheritanceProgram();
		mip.show();
	}

}
