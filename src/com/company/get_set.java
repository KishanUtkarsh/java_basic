package com.company;
import java.util.Scanner;

class details{
    private String name;
    private int age;
    private long mobile_number;

    void setName(String s){
        this.name = s;
    }
    void setAge(int x){
        this.age = x;
    }
    void setMobile_number(long y){ this.mobile_number = y; }
    String getName(){ return this.name; }
    int getAge(){
        return this.age;
    }
    long getMobile_number(){
        return this.mobile_number;
    }

}

public class get_set {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the person :");
        String s = sc.nextLine();
        System.out.print("Enter the age of the person :");
        int x = sc.nextInt();
        System.out.print("Enter the mobile number of the person :");
        long y = sc.nextLong();
        details obj = new details();
        obj.setAge(x);
        obj.setMobile_number(y);
        obj.setName(s);

        System.out.printf("Name of the person is : %s%n",obj.getName());
        System.out.printf("Age of the person is : %d%n",obj.getAge());
        System.out.printf("Mobile number of the person is : %d%n",obj.getMobile_number());

    }
}