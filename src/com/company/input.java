package com.company;
import java.util.Scanner;

public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("the given input by the user is : %d and %d",a,b);
        System.out.println(sc.nextLine()); // its a string input and gives same output
    }

}
