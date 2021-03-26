package com.company;

public class array_sum {
    public static void main(String [] args){

        int [] a = {1,2,3,4,56,6};
        int sum = 0;
        for (int j : a) {
            sum += j;

        }
        System.out.printf("the sum of the given array is : %d",sum);
    }
}
