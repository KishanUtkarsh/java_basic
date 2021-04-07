package com.company;
import java.util.*;
import java.lang.*;
class MyCalculator {

    long power(int a , int b)throws Exception{
        if (a == 0 && b == 0){
            throw new Exception("n and p should not be zero.");
        }
        else if (a < 0 || b < 0){
            throw new Exception("n or p should not be negative.");
        }
        else{

            // int d = 1;
            // while (b > 0){

            //     d = d*a;
            //     b -= 1 ;
            // }
            // return d;

            return (int) Math.pow(a,b);
        }
    }
}
public class exception_handling {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        final MyCalculator mc = new MyCalculator();


        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(mc.power(x ,y));
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
