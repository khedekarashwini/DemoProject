
package com.sample.programs;
interface clonnable 
{
	
}
class A implements clonnable
{
	int age;
	String name;
	
	public A(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	protected Object clone()
	throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class DemoClonnebaleInt {

	public static void main(String[] args) throws CloneNotSupportedException {
	 //throws CloneNotSupportedException
	 
		 A a=new A(20,"Ashwini");
		 A b=(A)a.clone();
		 System.out.println(b.age);
		 System.out.println(b.name);
	 

	}

}