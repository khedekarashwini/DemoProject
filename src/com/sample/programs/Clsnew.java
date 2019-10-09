package com.sample.programs;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Clsnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String,Integer> hm=new  HashMap<String,Integer>();
           hm.put("abc", 67);
           
           hm.put("pqr", 87);
           hm.put("xyz", 97);
           hm.put("pqr", 87);
           hm.put("pqr", 87);

           hm.put("mnc", 57);
          System.out.println( hm.size());
 
     /* for (Map.Entry<String ,Integer>mtr:hm.entrySet())
       {
		System.out.println("kEY="+mtr.getKey()+"Values="+mtr.getValue());
	  } 
      for(String str:hm.keySet())
      {
    	  System.out.println("Keys="+str);
      }*/
      for (Integer str: hm.values()) {
    	  
		System.out.println(str);
	}
           
           /* Collection<String>  str=hm.keySet();
    Iterator<String> itr=hm.keySet().iterator();
       while (itr.hasNext()) {
		String string = (String) itr.next();
		System.out.println(string);

	}*/
		       }
	}


