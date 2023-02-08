package com.practice.arrays;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberPair {

    @Test
    public void testCase() {
        List<List<Integer>> outPut = new ArrayList<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 11, 17, 12, 5, 6, 4, 22, 22, 20));
        List<Integer> tempList=new ArrayList<>();

        for(Integer var:list){
            List<Integer> temp = new ArrayList<>();
            if(list.contains(var*2) && !tempList.contains(var*2)  && !tempList.contains(var)){
                temp.add(var);
                temp.add(var*2);
                tempList.addAll(temp);
                outPut.add(temp);
            }
        }

        System.out.println(outPut);
    }


}
