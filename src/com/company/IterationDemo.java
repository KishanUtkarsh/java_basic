package com.company;
import java.util.LinkedList;
import java.util.Iterator;

public class IterationDemo {
    public static void main(String[] args) {
        LinkedList <String> s = new LinkedList<>();
        s.add("i am a good person");
        s.add("how can i became a good person");
        s.add("someone said that i am a good person");

        Iterator<String> it = s.iterator();
        for (String b : s){
            String a = it.next();
            boolean c = it.hasNext();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        Iterator<String> it1 = s.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
