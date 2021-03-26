package com.company;

import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int i;
        for (i = 0 ; i < 3 ; i++){
            int per = (amount/10);
            amount -= per;

        }
        System.out.println(amount);
    }
}
