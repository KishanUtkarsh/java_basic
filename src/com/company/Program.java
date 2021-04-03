package com.company;

import java.util.Scanner;


abstract class Shape {
    int width;
    abstract void area();
}

class Circle extends Shape {

    Circle(int a){
        super.width = a;
    }
    @Override
    public void area(){
        System.out.println(Math.PI*width*width);
    }
}
class Square extends Shape{
    Square(int a){
        super.width = a;
    }
    @Override
    public void area(){
        System.out.println(width*width);
    }
}

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
