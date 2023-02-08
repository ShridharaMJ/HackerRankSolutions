package com.practice.interview;

import org.testng.annotations.Test;

public class RemoveWhiteSpace {
    @Test
    public void solution(){
        String str="This is testing world..";

        // Using REGEX
        System.out.println("Remove white space using regx -> "+str.replaceAll(" ",""));

    }
}
