package com.practice.strings;

import org.testng.annotations.Test;

public class AnagramUsingArrays {

	@Test
	public void testCase() {
		 boolean flag=false;
		String a="anagram";
		String b="margana";		
		 a=a.toLowerCase();
	        b=b.toLowerCase();
	        if(a.length()!=b.length()){
	        	flag =false;}
	         
	       
	        char[] aa=sortChars(a.toCharArray());
	        char[] bb=sortChars(b.toCharArray());
	        
	        for(int i=0;i<aa.length;i++){
	            if(aa[i]==bb[i]){
	            flag=true;}
	            else{
	                flag=false;
	                break;
	            }
	            }
	        
	     System.out.println(flag);
	}
	
	public static char[] sortChars(char[] c){
	      for (int i = 0; i < c.length; i++) {
	            for (int j = i; j < c.length; j++) {

	                if (c[i]>(c[j])) {
	                    char temp = c[i];
	                    c[i] = c[j];
	                    c[j] = temp;

	                }

	            }

	        }
	        return c;
	  }
}
