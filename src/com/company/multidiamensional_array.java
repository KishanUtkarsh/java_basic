package com.company;

public class multidiamensional_array {
    public static void main(String[] args){
        int [][] a = {{1,2,3},{4,5,6}};
        for (int[] ints : a) {
            int sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum += ints[j];

            }
            System.out.println(sum);
        }
}
}