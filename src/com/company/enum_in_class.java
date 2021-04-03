package com.company;
enum Rank{
    SOLDIER,

    SERGEANT,

    CAPTAIN

}

public class enum_in_class {
    public static void main(String[] args) {
        Rank r = Rank.SOLDIER;
        System.out.println(r);
        switch (r){
            case SOLDIER:
                System.out.println("hello soldier");
                break;
            case SERGEANT:
                System.out.println("hello sergeant");
                break;
            case CAPTAIN:
                System.out.println("hello captain");
                break;
        }
    }
}
