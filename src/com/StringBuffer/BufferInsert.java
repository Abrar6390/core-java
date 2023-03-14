package com.StringBuffer;

public class BufferInsert {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("helloguys");
		StringBuffer sb2=new StringBuffer("guys");
		sb=sb.append(sb2);
		System.out.println(sb.insert(7, 'w'));
	}

}
