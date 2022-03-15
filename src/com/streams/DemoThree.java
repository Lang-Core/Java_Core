package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoThree {
    public static void main(String[] args) {
        ArrayList<String> lowerList = new ArrayList<>();
        lowerList.add("apple");
        lowerList.add("ball");
        lowerList.add("cat");
        lowerList.add("donkey");
        List<String> upperList = lowerList.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperList.toString());
    }
}
