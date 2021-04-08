package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_list {
    public static void main(String...args) {
        ArrayList<Integer> intList = new ArrayList(10);
        intList.addAll(Arrays.asList(4,5,6));
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("kishan kumar");
        String s = colorList.get(0);
        System.out.println(s);
        boolean b = colorList.contains("kishan kumar");
        System.out.println(b);
        colorList.add(1, "Saumya Kumar");
        System.out.println(colorList);
    }
}
