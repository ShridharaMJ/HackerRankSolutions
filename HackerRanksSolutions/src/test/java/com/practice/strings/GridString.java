package com.practice.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GridString {
    public static void main(String[] args) {

        List<String> listOutput=new ArrayList<>();
        List<String> grid = Arrays.asList("7283455864","6731158619",
"8988242643",
"3830589324",
"2229505813",
"5633845374",
"6473530293",
"7053106601",
"0834282956",
"4607924137");
        List<String> pattern = Arrays.asList("9505",
"3845",
"3530");

        final int glength=grid.size();
        final int plength=pattern.size();

        for (int i = 0; i < grid.size(); i++) {

            if(i+pattern.size()-1<grid.size()){

                int initailIndex = 0;
                int lastIndex=initailIndex+plength+1;



                while(lastIndex<=glength){
                    listOutput.add(grid.get(i).substring(initailIndex,lastIndex)+grid.get(i+1).substring(initailIndex,lastIndex)+grid.get(i+2).substring(initailIndex,lastIndex));
                    initailIndex++;
                    lastIndex++;
                }

            }

        }

        if(listOutput.contains(pattern.stream().collect(Collectors.joining())))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
