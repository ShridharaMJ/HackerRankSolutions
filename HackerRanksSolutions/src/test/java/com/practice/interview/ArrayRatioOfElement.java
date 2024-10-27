package com.practice.interview;

import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayRatioOfElement {

    @Test
    public void testArrayRatioOfElement() {

        final List<Integer> input = List.of(1, -2, -7, 9, 1, -8, -5);
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        //  Map<Integer, Long> mapData = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        //Grouping should be based on Positive & Negative numbers
        Map<Integer, Long> mapData = input.stream().map(e -> e > 0 ? 1 : e).map(n -> n < 0 ? -1 : n).map(z -> z == 0 ? 0 : z).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        final double size = input.size() * 1.0;

        System.out.println(decimalFormat.format((mapData.containsKey(1) ? mapData.get(1) : 0 )/ size));
        System.out.println(decimalFormat.format((mapData.containsKey(-1) ? mapData.get(-1) : 0 )/ size));
        System.out.println(decimalFormat.format((mapData.containsKey(0) ? mapData.get(0) : 0) / size));


    }

}
