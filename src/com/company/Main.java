package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array =  new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int j = 0; j<length ;j++){
            if (array[j]%4 == 0){
                sum += array[j];
            }
            else{
                continue;
            }
        }
        System.out.print(sum);



    }
}