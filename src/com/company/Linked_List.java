package com.company;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList();
        colors.add("red");
        colors.add("black");
        colors.add("green");
        boolean b = colors.remove("red");
        System.out.println(b);
        for (String s : colors){
            System.out.println(s);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
