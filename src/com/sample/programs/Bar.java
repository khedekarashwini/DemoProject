package com.sample.programs;
class Foo
{
	Foo()
	{
		m1();
	}
	void m1()
	{
		System.out.println("Foo");
	}
}
public class Bar extends Foo {
	int x=5;
	void m1()
	{
		System.out.println("x="+x);
	}


	public static void main(String[] args) {
		Foo f1 =new Foo();
		f1.m1();
	  Foo f=new Bar();
	  f.m1();
	  Bar b=new Bar();
	    b.m1();
	}
}

