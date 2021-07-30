package main.java.com.epam;

import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int flag;

        do {
            System.out.println(
                    "Please type the number of operation you need. Type zero to exit:\n"+
                    "1. Sum.\n" +
                    "2. Subtraction.\n" +
                    "3. Multiplication.\n" +
                    "4. Division.\n"+
                    "5. Raise to power.\n"+
                    "6. Square root.");
            flag = scanner.nextInt();
            switch (flag){
                case 1:
                    System.out.println("Result: " + calculator.getSum(calculator.getFirstNum(),calculator.getSecondNum()));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.getDiff(calculator.getFirstNum(),calculator.getSecondNum()));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.getProduct(calculator.getFirstNum(),calculator.getSecondNum()));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.getQuotient(calculator.getFirstNum(),calculator.getSecondNum()));
                    break;
                case 5:
                    System.out.println("Result: " + calculator.getPower(calculator.getFirstNum(), calculator.getSecondNum()));
                    break;
                case 6:
                    System.out.println("Result: " + calculator.getSquareRoot(calculator.getFirstNum()));

            }
        }while (flag !=0);
    }
}
