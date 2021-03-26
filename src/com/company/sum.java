package com.company;
import java.util.Scanner;
/** this is the multiple line comment for printing in terminal */

public class sum {
    public static void main(String[] args){

        int a = 5;
        float f = 23.5f;
        int b = 6;
        int d = a - 2 ;
        int e = a / 2;

        System.out.println(e);

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.printf("your given input is :%d ",input);
        System.out.printf("\nthe sum of this two number is : %d",a+b);
        System.out.println("\n"+d);

    }
}
