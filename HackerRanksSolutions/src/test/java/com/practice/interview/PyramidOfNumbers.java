package com.practice.interview;

import org.testng.annotations.Test;

import javax.swing.plaf.IconUIResource;

public class PyramidOfNumbers {
    @Test
    public void solution(){
        int len=5;
        int count=1;
        for(int i=0;i<len;i++){
            for(int k=0;k<len-i;k++){
                System.out.print(" ");}
                for(int j=0;j<i;j++){

                    System.out.print(" "+ count);
                    count++;
                }
            System.out.println("");
            }

    }
}
