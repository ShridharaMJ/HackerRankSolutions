package com.practice.interview;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementInArray {
    @Test
    public void solution(){
        Integer[] arr={12,34,54,55,66,99,12};
        List<Integer> duplicate=new ArrayList<>();
        List<Integer> list = Arrays.asList(arr);
        for (Integer i: list) {
            if (list.indexOf(i)!=list.lastIndexOf(i) && !duplicate.contains(i)) {
                System.out.println(i+ " is duplicate element in an array");
                duplicate.add(i);
            }

        }
    }


    @Test
    public void SolutionStream(){
        List<Integer> list = Arrays.asList(12, 34, 54, 55, 66, 99, 12, 54);
        list.stream().filter(i -> list.indexOf(i) != list.lastIndexOf(i)).collect(Collectors.toSet()).forEach(s-> System.out.println(s+ " is the duplicate element"));


    }


}
