package com.practice.interview;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArraysEquals {
    @Test
    public void solution(){
        int[] i1= new int[]{1, 3, 4, 5, 5};
         int[] i2= new int[]{1, 3, 4, 5, 6};
        boolean equals = Arrays.equals(i1, i2);
        if(equals)
        System.out.println("Arrays are equal...");
        else
            System.out.println("Arrays are not equals...");
    }
}
