package com.company;

interface animal{
    public void makesoun();
    public void ate();
}

class billi implements animal{
    public void makesoun(){
        System.out.println("meeao..");
    }
    public void ate(){
        System.out.println("drink milk");
    }
}
public class interface_abstraction {
    public static void main(String[] args) {
        billi b = new billi();
        b.ate();
        b.makesoun();
    }
}
