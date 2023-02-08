package com.practice.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string.
 Letters cannot be rearranged. Given two strings of equal length, what's the longest string that can be constructed such that it is a child of both?
Example
These strings have two children with maximum length 3, ABC and ABD. They can be formed by eliminating either the D or C from both strings. Return
Function Description
Complete the commonChild function in the editor below.
commonChild has the following parameter(s):

    string s1: a string
    string s2: another string

Returns int: the length of the longest string which is a common child of the input strings

 */
public class LongestChild {

    public static void main(String[] args) {

        System.out.println(commonChild("SHINCHAN","NOHARAAA"));;
    }

    public static int commonChild(String s1, String s2) {
int count=0;
        for (int i = 0; i < s1.length(); i++) {
            char charTemp = s1.charAt(i);
            if(s2.indexOf(charTemp)!=-1){
                count++;
             //   int i1 = s2.indexOf(charTemp);
               s2 = s2.replaceAll(String.valueOf(charTemp),"");

            }

        }
        
        
      
        return count;
    }

}
