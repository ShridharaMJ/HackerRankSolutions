package com.practice.interview;

import org.testng.annotations.Test;

public class ArmstrongNumber {
    @Test
    public void solution(){
        int input=234;
        String[] split = String.valueOf(input).split("");
        int sum=0;
        for (String str:split) {
            int i = Integer.parseInt(str);
            sum+=i*i*i;
        }
        if(sum==input)
            System.out.println("Given number is Armstrong number");
        else
            System.out.println("Given number isn't Armstrong number");


    }
}
