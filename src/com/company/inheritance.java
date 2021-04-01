package com.company;



class animals{
    protected int leg;
    animals(){
        System.out.println("hello this is a very bad programing idea to check a constructor.");
    }
    public void bark(){
        System.out.println("this animal barks");
    }
    public void eat(){
        System.out.println("animal eats");
    }
}
class Dog extends animals{
    Dog(){
        super();
        leg = 4;
        System.out.println("this is subclass constructor.");
    }
}

public class inheritance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
