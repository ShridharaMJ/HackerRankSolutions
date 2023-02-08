package com.practice.interview;

import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

    @Test
    public void solutionUsingStringFunction() {
        System.out.println("\nSolution Using String Function");
        String str = "eeryuiry";
        str = str.replaceAll(" ", "");
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println(ch + " is duplicate char");
              str=  str.replaceAll(String.valueOf(ch),"");
            }
            i++;

        }
    }
    
    @Test
    public void solutionUsingMap(){
        System.out.println("\nSolution using Map");
          String str = "eeryuiry";
       str = str.replaceAll(" ", "");
       Map<Character,Integer> map=new HashMap<Character,Integer>();
        char[] chars = str.toCharArray();
        for (char c:chars) {
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c,1);
        }
        for(Map.Entry<Character,Integer> ch:map.entrySet()){
            if(ch.getValue()>1){
                System.out.println(ch.getKey() + " is duplicate char");
            }
        }

    }

    @Test
    public void solutionUsingStream(){
        System.out.println("\nSolution using stream");
        String str = "eeryuiry";
         Arrays.stream(str.replaceAll(" ", "").split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().filter(s -> s.getValue() > 1).forEach(values-> System.out.println(values.getKey() +" is duplicate char"));

    }
}