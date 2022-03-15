package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoFour {
    public static void main(String[] args) {
        String text = "Interfaces cannot have instance variables " +
                "but it is legal to specify constants. When declaring a " +
                "constant in an interface you can (and should) omit the " +
                "reserved words public static final because all variables " +
                "in an interface are automatically public static final.";

        List<String> textList = Stream.of(text.split(" "))
                .filter(i -> i.charAt(0)== 'i')
                .collect(Collectors.toList());
        System.out.println(textList.toString());

        String myWord = "how much wood could a wood chuck chuck";
        List<String> myWordsEndsWithD = Stream.of(myWord.split(" "))
                .filter(i -> i.charAt(i.length() - 1) == 'd')
                .collect(Collectors.toList());
        System.out.println(myWordsEndsWithD.toString());

        long count = Stream.of(myWord.split(" "))
                .count();

        int length = myWord.split(" ").length;
        System.out.println(count);
        System.out.println(length);

    }
}
