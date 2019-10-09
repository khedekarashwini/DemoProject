package com.sample.programs;
interface Permission 
{
	   
}
class B
{
	public static void m1()
	{
		System.out.println("in m1 method");
	}
}
public class DemoMarkenInterF implements Permission {
   
     void show()
	   {
		   System.out.println("Hello");
	   }
   
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoMarkenInterF obj=new DemoMarkenInterF();
		B b=new B();
		
		if (obj instanceof Permission)
		      obj.show();
		     //B.m1();
		else
		  System.out.println("Not permission");
	}

}
