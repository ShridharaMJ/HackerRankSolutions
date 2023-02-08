package com.practice.interview;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Anagram {
    @Test
    public void solution() {
        String s1 = "race";
        String s2 = "care";
        char[] s1Array = s1.toCharArray();
         char[] s2Array = s1.toCharArray();

        if (s1Array.length != s1Array.length) {
            System.out.println("Given strings are not Anagram..");
            return;
        }
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        if (Arrays.equals(s1Array, s2Array))
            System.out.println("Given strings are  Anagram..");
         else
            System.out.println("Given strings are not Anagram..");
    }
}