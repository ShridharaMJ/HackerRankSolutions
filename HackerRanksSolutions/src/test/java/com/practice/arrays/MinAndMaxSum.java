package com.practice.arrays;

import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinAndMaxSum {

    /*
    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
    Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    Example
    arr = [1,3,5,7,9]
    The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints
    16 24
     */


    @Test
    public void minMaxSunTest() {


        //int presents 32 bit signed integer number
        //Integer -> Object representation of int
        // BigInteger -> represents large integer numbers

        List<Integer> arr = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
        List<Integer> list = arr.stream().sorted().collect(Collectors.toList());
        System.out.println(list.stream().limit(list.size() - 1).map(BigInteger::valueOf).reduce(BigInteger::add).get() + " " + list.stream().skip(1).map(BigInteger::valueOf).reduce(BigInteger::add).get());

//        System.out.println(623958417+714532089+623958417+467905213);


    }
}
