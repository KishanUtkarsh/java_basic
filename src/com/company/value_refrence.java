package com.company;

public class value_refrence {

    public static void main(String[] args){
        int x = 5;
        oneMore(x);
        System.out.println(x);

        T t = new T();
        T t1 = new T();
        t1 = null;
        System.out.println(t);
        System.out.println(t1);

    }
    // this method not effect the value of a it still print a = 5
    static void oneMore(int n){
        n += 1;
    }
}


class T{

}
