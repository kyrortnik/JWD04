package main.java.com.epam;

import java.util.Scanner;

public class Calculator {

    private Scanner scanner;

    public int getSum(int x, int y){

        return x + y;
    }
    public int getDiff(int x,int y){

        return x - y;
    }
    public int getProduct(int x, int y){

        return  x * y;
    }
    public double getQuotient(int x, int y){

        return (double) x / y;
    }

    public double getPower(int x,int y){
        return Math.pow(x,y);
    }

    public double getSquareRoot(int x){
        return Math.sqrt(x);
    }


    public int getFirstNum(){

        System.out.println("Enter first number:");
        scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
    public int getSecondNum(){

        System.out.println("Enter second number:");
        scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

}
