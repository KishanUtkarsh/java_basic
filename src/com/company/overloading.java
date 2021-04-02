package com.company;

// example of method overloading
class max{
    int maximum(int a , int b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    double maximum(double a , double b){
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}

public class overloading {
    public static void main(String[] args) {
        max a = new max();
        System.out.println(a.maximum(1,2));
        System.out.println(a.maximum(1,2));
    }
}
