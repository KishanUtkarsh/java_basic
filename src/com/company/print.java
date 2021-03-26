package com.company;
import java.util.Scanner;
/*
input :
python 100
java 30
sql 50

output :
python         100
java           030
sql            050

 */

public class print {
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner (System.in);
        for (i = 0 ; i < 3 ; i++){
            String s1 = sc.next();
            int a = sc.nextInt();

            System.out.printf("%-15s%03d",s1,a);


        }
    }
}
