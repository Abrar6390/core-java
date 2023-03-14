package com.Collectio;

import java.util.*;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.management.ValueExp;
import javax.security.auth.login.FailedLoginException;

public class ConcurentModificationException {
     public static void main(String[] args) {
		//List list= new ArrayList<>();
    	 List list=new CopyOnWriteArrayList(); //fail fas handle
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		System.out.println(list);
        ListIterator li=list.listIterator();
          
        		{
        	while (li.hasNext()) {
        	   list.add(333);//FailFast
        	                
				System.out.println(li.next());
				
			}
        	
	}
}
}
