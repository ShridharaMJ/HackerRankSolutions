package com.practice.arrays;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class MagicSquare {


    @Test
    public void solution() {

        List<Integer> l1 = Arrays.asList(5, 3, 4);
        List<Integer> l2 = Arrays.asList(1, 5, 8);
        List<Integer> l3 = Arrays.asList(6, 4, 2);

        List<List<Integer>> lists = Arrays.asList(l1, l2, l3);
             lists.stream().flatMap(List::stream).collect(Collectors.toList());

        //Solution

        int expectedTotal;
        int NumToFind = 9;
        for (List<Integer> list : lists) {
            if(list.contains(NumToFind)){
                expectedTotal=(int)list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
            }
        }



    }
}
