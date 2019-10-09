package com.sample.programs;

import java.util.Scanner;

public class DemoStringRev {

	public static void main(String[] args) {
		//String original;
		//String rev = null;
		
		//System.out.println("Enter your string");
		 //Scanner sc=new Scanner(System.in);
		 //original=sc.next();
		/* int len=original.length();
		 for (int i = len-1; i >=0; i--) {//using for loop
			rev=rev+original.charAt(i); 
		}*/
		
	//*****2nd way****************
		/* StringBuffer sb=new StringBuffer(original);//using string buffer
		rev=sb.reverse().toString();
		
		System.out.println("Original string is="+original);
		System.out.println("Reverse String is="+rev);*/
		 String str="My name is ashwini";
		 String str1 = "";
		 String[] a=str.split(" ");
		
		 
		 for (int i = 0; i<a.length; i++) {	
        System.out.print(a[i]+" ");
		 }
		 System.out.println("");
		 for (int i = a.length-1; i >=0; i--) {
				str1=str1+a[i]+" ";
				}	
		 System.out.println("Reverse string is="+str1);

	}

}
