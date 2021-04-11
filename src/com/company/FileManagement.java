package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileManagement {
    public static void main(String [] args) throws FileNotFoundException {
        try{
            Formatter f1 = new Formatter("C:\\Users\\kisha\\OneDrive\\Desktop\\Files\\test.txt");
            int x =5;
            while(x > 0){
                f1.format("\r\n%s","this is the number "+x);
                x--;
            }
            f1.close();
        }catch (Exception e){
            System.out.println(e);
        }
        File f = new File("C:\\Users\\kisha\\OneDrive\\Desktop\\Files\\test.txt");
        if (f.exists()){
            System.out.println(f.getName()+" is already exists");
        }
        else {
            System.out.println("file not found");
        }
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }



    }



}
