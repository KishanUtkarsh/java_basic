package com.company;

class jaanwar {

    public void makesound(){
        System.out.println("Grr..");
    }
}
class Cat extends jaanwar{

    public void makesound() {
        System.out.println("cat makes sound :meeao");
    }
}
class kutta extends jaanwar{
    public void makesound(){
        System.out.printf("dogs makes sound : woooh");
    }
}
public class polimorphism{
    public static void main(String[] args){
        jaanwar a = new Cat();
        jaanwar b = new kutta();
        kutta k = new kutta();

        a.makesound();
        b.makesound();
        k.makesound();
    }
}