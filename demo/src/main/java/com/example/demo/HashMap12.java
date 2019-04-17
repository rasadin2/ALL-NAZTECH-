package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMap12 {
	 public static void main(String args[]){  
		   HashMap< String,String> hm=new HashMap<String,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		     String[] x1= {"01","02","03"};
		     String[] x2= {"asad","samad","robel"};
		     for(int i=0;i<x1.length;i++) {
		     for(int j=0;j<x2.length;j++) {
		     hm.put(String.valueOf(x1[i]), String.valueOf(x2[i]));      
		     }
		     }
		      System.out.println("After invoking put() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
//		        
                 hm.putIfAbsent("04", "Gaurav");  
                 System.out.println("After invoking putIfAbsent() method ");  
                 for(Map.Entry m:hm.entrySet()){    
		          System.out.println(m.getKey()+" "+m.getValue());    
		          }  
                 
                 
		      HashMap<String,String> map=new HashMap<String,String>();  
		      map.put("05","Ravi");  
		      map.putAll(hm);  
		      System.out.println("After invoking putAll() method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		 }   

	}


