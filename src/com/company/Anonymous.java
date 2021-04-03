package com.company;

// Anonymous classes are a way to extend the existing classes on the fly.
class car{
    public void carsound(){
        System.out.println("vroom vroom");
    }
    public void carColor(){
        System.out.println("red");
    }
}

public class Anonymous {
    public static void main(String[] args){
        /* The modification is applicable only to the current object, and not the class itself.
        So if we create another object of that class, the start method's implementation will be the one
        defined in the class.
         */
        car c = new car(){
            @Override public void carsound(){
                System.out.println("vrooooooooooooooooooom");
            }
            @Override public void carColor(){
                System.out.println("green");
            }
        };
        c.carsound();
        c.carColor();
        car c1 = new car();
        c1.carColor();
        c1.carsound();
    }
}
