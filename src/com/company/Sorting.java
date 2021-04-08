package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList <String> s = new ArrayList<>();
        s.add("kishan kumar");
        s.add("rohit kumar");
        s.add("rahul kumar");
        s.add("sunny kumar");
        ArrayList <Integer> a = new ArrayList<>();
        a.add(100);
        a.add(200);
        a.add(300);
        a.add(400);
        Collections.sort(s);
        System.out.println(s);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);


    }

}
