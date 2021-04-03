package com.company;
// type casting
// in the type casting some time data should loss or sometime data does not loss
// when we store big data like double in integer then data will loss but when we cast int to double the data will not loss
public class casting {
    public static void main(String[] args) {
        double d = 3.14;
        int a = (int) d; // data loss
        System.out.println(a);
        int c = 12;
        double b = (double) c; // no data loss
        System.out.println(b);
    }
}
