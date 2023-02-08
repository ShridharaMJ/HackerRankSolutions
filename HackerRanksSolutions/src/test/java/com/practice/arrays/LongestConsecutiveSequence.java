package com.practice.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(0,3,7,2,5,8,4,6,0,1);
        List<Integer> sortedList = nums.stream().sorted().toList();
        int longestSequence = 1;
        int tempLong=1;
        for (int i = 0; i < sortedList.size()-1; i++) {
            if(sortedList.get(i+1)-sortedList.get(i)==1)
                tempLong++;
            else
            {
                if(tempLong>longestSequence)
                    longestSequence=tempLong;
                tempLong=1;
            }

        }

        System.out.println("Longest consecutive sequence is "+ (Math.max(longestSequence, tempLong)));


    }
}
