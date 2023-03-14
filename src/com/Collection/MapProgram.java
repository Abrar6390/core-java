package com.Collection;
import java.util.*;
public class MapProgram {

	public static void main(String[] args) {
	Map map=new HashMap();
	map.put(1,"khan");
	map.put(2,"Abrar");
	map.put(3,"Ahmad");
	map.put(4,"Ayaz");
	
	System.out.println(map);
	
	 map.isEmpty();
	    System.out.println(map);
	
    Map<Integer,String> map2=new LinkedHashMap<>();
    
    map2.put(111,"Salman");
    map2.put(222,"Zaki");
    map2.put(333,"mohsin");
    
    System.out.println(map2);
    System.out.println("--------------");
    map2.putIfAbsent(11,"hii");;;;
    System.out.println(map2);;;;;
    System.out.println("++++++++++++++++++++++++");
    map.remove(4);
    map.remove(1,"khan");;
  
    System.out.println(map);
    
    System.out.println("___________________");
    //map2.containsKey(333);
   // map2.get(333);
    System.out.println(".....................");
	map2.putAll(map);
	
	System.out.println(map2);
	}	
	}
