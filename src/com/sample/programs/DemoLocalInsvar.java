package com.sample.programs;

public class DemoLocalInsvar {
	static int j=90;// Static variable accessed by class reference
	int a=10;//instance variable accessed by obj reference
  void m1()
  {
	  //SSystem.out.println(a);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// System.out.println(a);//not allowed create object of class or declare it static

		DemoLocalInsvar vi=new DemoLocalInsvar();
		
				
		System.out.println(vi.a);
		System.out.println(DemoLocalInsvar.j);
		System.out.println(vi.j);
		System.out.println(vi.j=87);
int i;//local variable
int arg1[]= {1,2};
if(arg1.length<=0)
{
	i=10;
}else
{
  i=20;	
}
	System.out.println(i);
}

}
