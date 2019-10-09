package com.sample.programs;


class Parent
{
  public static void name()
  {
	  System.out.println("static method of parent");
  }
}
class Child extends Parent
{
  public static void name()
  {
	  System.out.println("Child class static method");
  }
}
public class MethodHiding {

	public static void main(String[] args) {
	    Parent p=new Parent();
	    p.name();
	    Child c=new Child();
	    c.name();
	    Parent p1=new Child();  //Static method can not override it's method hiding 
	       p1.name();            //  it break overriding rule it calles parent class method 
//if we create child class reference and obj of parent in override calls method of object class
	}

}
