package com.company;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_Set {

    public static void main(String[] args){
        HashSet<String> s = new HashSet(); // its assign the value randomly.
        LinkedHashSet<Integer> a = new LinkedHashSet<>(); // its assign the value in given order.
        s.add("kishan kumar");
        s.add("rohit kumar");
        s.add("rahul kumar");
        s.add("sunny kumar");
        a.add(100);
        a.add(200);
        a.add(300);
        a.add(400);
        for (String j : s){
            System.out.println(j);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        for (Integer i: a){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }
}
