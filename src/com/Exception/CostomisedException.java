package com.Exception;

public class CostomisedException extends Exception
{
	public CostomisedException() {
	    super("under age 18 ");
	}
	public CostomisedException(String msg)
	{
		super(msg);
	}
  public static void main(String[] args) throws CostomisedException {
	int age=17;
	if(age<18)
	{
		throw new CostomisedException();
		
	}
	else 
	{
		System.out.println("your are 18 plus ");
	}
	
}
}
