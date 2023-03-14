package com.Collection;

public class CollectionMethodsUse {
   String name;
   int age;
   void Sum(String name,int age )
   {
	   name=name;
	   age=age;
	   System.out.println(this.name+"\n "+this.age);
   }
   public static void main(String[] args) {
	   CollectionMethodsUse cm1= new CollectionMethodsUse();
	   cm1.Sum("sameer",18);
}
	}


