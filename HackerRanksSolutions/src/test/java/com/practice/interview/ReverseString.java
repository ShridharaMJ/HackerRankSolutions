package com.practice.interview;

/* Reverse String */
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    @Test
    public void solution(){

        String str="Testing";

        //Using loop
        String  loopOutPut="";

        for(int i=str.length()-1;i>=0;i--){
            loopOutPut+=str.charAt(i);
        }
        System.out.println("Using loop - "+loopOutPut);


        //Using StringBuffer

        System.out.println("using StringBuffer - "+new StringBuffer(str).reverse());


    }
}
