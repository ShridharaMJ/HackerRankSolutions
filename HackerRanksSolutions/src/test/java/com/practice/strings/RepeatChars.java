package com.practice.strings;

public class RepeatChars {
    public static void main(String[] args) {
        String str="a3g2m1k4";
        String output="";
        for (int i = 0; i < str.length()-1; i=i+2) {
            char character=str.charAt(i);
            int repeat=Integer.parseInt(String.valueOf(str.charAt(i+1)));
            for(int j=0;j<repeat;j++){
                output+=character;
            }
        }

        System.out.println("Output -> "+output);
    }


}


