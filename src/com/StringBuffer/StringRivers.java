package com.StringBuffer;

public class StringRivers {
		public static void main(String []ayaz){
		String s="Abrar";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		/*
		 * if(s.equals(rev)) { System.out.println("palendrom string"); } else
		 */
			System.out.println("not a palendrom string"+rev);
		}


	}


