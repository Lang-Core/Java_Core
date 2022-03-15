package com.streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class DemoFive {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(8);
        nums.add(5);
        nums.add(1);
        nums.add(6);

        int count;
        //int sum = nums.stream().mapToInt(i -> i.intValue()).sum();
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        Integer integer = nums.stream().filter(n -> n.intValue() == 0).findFirst().orElse(-1);
        System.out.println(integer);

    }
}
