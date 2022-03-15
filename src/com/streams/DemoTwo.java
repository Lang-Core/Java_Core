package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTwo {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Go");
        namesList.add("JavaScript");
        namesList.add("TypeScript");
        namesList.add("Ruby");
        namesList.add("PHP");

        long count = namesList.stream().filter(n -> n.length() > 4).count();
        System.out.println(count);

        List<String> colList = namesList.stream().filter(n -> n.length() > 4).limit(2).collect(Collectors.toList());
        System.out.println(colList.toString());

    }
}
