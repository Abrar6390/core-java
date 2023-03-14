package com.Collection;

import java.util.ArrayList;

public class CollectionFirstProgram {	
	public static void main(String[] args) {
		
ArrayList al=new ArrayList();
   al.add(100);
   al.add(150);
   al.add(199);
   al.add(3333);
   al.add("kkk");
   System.out.println(al);
   
   ArrayList al2=new ArrayList();
   al2.add("Abrar");
   al2.add("Khan");
   al2.add("ahmad");
   
   System.out.println(al2);
   
   al.add(al2);
   
   System.out.println(al2.add(111));
   System.out.println(al2);
   System.out.println(al);
	

}
}
 
