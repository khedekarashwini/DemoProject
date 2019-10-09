package com.sample.programs;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter your user name,age,salary=");
		Scanner sc=new Scanner(System.in);
     //asInteger id=sc.nextLine();
		String username=sc.nextLine();
  System.out.println("Username="+username);
   int age=sc.nextInt();
 System.out.println("Age="+age);
double salary=sc.nextDouble();
System.out.println("Salary"+salary);
	
		
	
	}

}
