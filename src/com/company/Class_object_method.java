package com.company;

public class Class_object_method {

    public static void main(String [] args){
        Animal dog = new Animal();
        dog.bark();
        dog.foot();
        dog.small_tails();
        int x = dog.sum(5,3);
        System.out.println(x);
    }
}
