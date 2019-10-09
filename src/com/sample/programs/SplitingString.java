package com.sample.programs;

public class SplitingString {

	public static void main(String[] args) {
		String s1="Apple|Microsoft|Google";
		String s2="AShwini99Datta99Karde";
		//String[] str=s1.split("\\|.S");//Rempve comma
		String[] str1=s2.split("\\d");//Removes no
		//String[] str2=s2.split("[a-zA-Z]");//Remove charcter
//String[] s3= ",a,b,c".split(",");

//sssString[] s4=s3;
//System.out.println(s4.toString());
  //String[] str3=s3.length
		for (String string1 : str1) {
			System.out.print(string1);
		}
	}

}
