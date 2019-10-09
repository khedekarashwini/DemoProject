package com.sample.programs;

public class Demo {

	private static final String None = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="33asdf56";
 /*char[] s2=s1.toCharArray();
 for (char c : s2) {
	if(!Character.isDigit(c))//Using is digit method
	 System.out.println(c);
}*/
 String[]s2=s1.split("\\d");
 for (String string : s2) {
System.out.println(string);	
}
    //String clean=s1.replaceAll("[^\\d]", "");//or[a-zA-Z]
    //System.out.println(clean);
 //boolean s2=Character.isDigit(s1);
 

	}

}
