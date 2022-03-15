package com.streams;

import java.util.ArrayList;

public class DemoOne {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Go");
        namesList.add("JavaScript");
        namesList.add("TypeScript");
        namesList.add("Ruby");
        namesList.add("PHP");

        int count = 0;

        for (String name : namesList) {
            if(name.length() > 4){
                count++;
            }
        }

        System.out.println(count);
    }
}
