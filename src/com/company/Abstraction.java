package com.company;

abstract class Animal1{
    int leg;
    abstract void makeNoise();
    abstract int haslegs();
    }
class cat1 extends Animal1{
    cat1(){
        this.leg = 4;
    }
    @Override
    void makeNoise() {
        System.out.println("meao..");
    }

    @Override
    int haslegs() {
        return this.leg;
    }
}




public class Abstraction {
    public static void main(String[] args) {
        cat1 a = new cat1();
        System.out.println(a.leg);
        a.makeNoise();
        System.out.println(a.haslegs());
    }
}
