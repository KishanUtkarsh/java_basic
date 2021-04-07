package com.company;

class myclass implements Runnable{
    int[] a = {1,2,3,4,5,6};
    public void mul(){
        for (int i = 0 ; i <6 ; i++){
            a[i] = a[i]*2;
        }
        for (int j = 0; j<6;j++){
            System.out.print(a[j]+" ");
            try{Thread.sleep(500);} catch (Exception e){}
        }
    }
     public void run() {
        for (int k = 0; k < 5; k++) {
            System.out.println("run");
            try{Thread.sleep(500);} catch (Exception e){}}
        }
    }


class hi extends Thread{
    public void run (){
        for (int i = 0; i < 5 ; i++){System.out.println("hii");
        try{Thread.sleep(500);} catch (Exception e){}}
    }
}
class hello extends Thread{
    public void run(){
        for (int j = 0; j<5 ; j++){System.out.println("hello");
        try{Thread.sleep(500);} catch (Exception e){}}
    }
}

public class multiple_thread {


    public static void main(String[] args) {
        Runnable th = new myclass();
        myclass t2 = new myclass();
        t2.mul();
        Thread t1 = new Thread(th);
        t1.start();
        hi h = new hi();
        hello he = new hello();
        h.start();
        he.start();
    }
}
