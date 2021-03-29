package com.company;

import java.sql.SQLOutput;

// making a constructors in java
// it is method which name is just class name
// constructor don't return anything.
public class construct {
    public static void main(String[] args){
        calc obj = new calc(6,5);
        System.out.println(obj.result);
        calc obj2 = new calc();
        calc obj3 = new calc(6);
        calc obj0 = new calc("RED");
        //obj.setColor("green");

    }

}

//  there will be multiple constructor.
class calc{
    private int a;
    int b;
    double result;
    private String color;
    calc(){
        a = 5;
        System.out.println(a);
    }
    public calc(int a, int b){
        this.a = a;
        this.b = b;
        this.result = a+b;
    }
    public calc(int a){
        System.out.println("lol");
    }
//    calc(String s){
//        this.color = s;
//        System.out.println(color);
//    }
     void setColor(String s){
        this.color = s;
     }
    calc (String s){
        this.setColor(s);
        System.out.println(color);
    }
}
