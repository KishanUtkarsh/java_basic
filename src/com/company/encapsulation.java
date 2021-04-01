package com.company;


class BankAccount{
    private double amount = 0;
    public void deposit(double x){
        this.amount += x;
        //System.out.println(amount);
    }
    public void setAmount(double x){
        this.amount += x;
        //System.out.println(amount);
    }
    public void getAmount(){
        System.out.printf("your account balance is : %.2f" ,amount);
    }
}
public class encapsulation {
    public static void main(String[] args){
        BankAccount obj = new BankAccount();
        obj.deposit(1253);
        obj.setAmount(8452);
        obj.getAmount();
    }
}