package com.company;
//public class demo {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = -5;
//        int c = Math.abs(b);
//        System.out.println(c);
//    }
//}
//import java.util.Scanner;
//public class Converter{
//    public static String toBinary(int a){
//        String binary="";
//
//        while(a > 0) {
//
//            binary = (a%2)+binary;
//
//             a /= 2;
//
//        }
//        return binary;
//
//    }
//}
//
//
//public class demo {
//    public static void main(String[ ] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.print(Converter.toBinary(x));
//    }
//}
//

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic{
    static int add(int a, int b){
        return a+b;
    }
}
class Adder extends Arithmetic{

}


public class demo{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}

