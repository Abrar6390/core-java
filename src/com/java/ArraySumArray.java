package com.java;
import java.util.*;
class ArraySumArray
{
	 public static void main(String[]args)
		{
	      Map map=new HashMap();
	      map.put(11,"Abrar");   
	      map.put(22,"Shadab");
	      map.put(33,"Kasim");
	      System.out.println(map);
		 
		  System.out.println("--------------");
		  
		  Set set=map.entrySet();
		  Iterator itr=set.iterator();
		        while(itr.hasNext())
		      {
		         Map.Entry entry=(Map.Entry )itr.next();
		         System.out.println(entry.getKey()+" "+entry.getValue());
		      }
		}
}