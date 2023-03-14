package com.StringBuffer;

public class BufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("khan Abrar");
		StringBuffer sb2=new StringBuffer("ayaz siddiqui");
		sb=sb.append(sb2);
       System.out.println(sb.reverse());
	}

}
