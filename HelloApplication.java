package org.example.proyecto_funciones_swich;

import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        printAnyString("hi you are the best program, the progra has some option such as: A,B and C");
        printAnyString("please type any option ");
        String readingSring = scanner.nextLine();
        switch (readingSring.toLowerCase()){
            case "a":
                printAnyString("Now you are in sum program,it is necessary to type two number,let us go ");
                printAnyString("Typing the fist number");
                int numberOne = scanner.nextInt();
                printAnyString("Typing the second number");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumber(numberOne,numberTwo);
                printAnyString("The result of sum is " + sumResult);

                break;
            case "b":
                printAnyString("You are now in the program to print country ");
                printAnyString("Typing the country:");
                String country = scanner.nextLine();
                printAnyString("The result of country is " + country);
                break;

            case "c":
                printAnyString("Now you are in the program to find the meanings of a number ");
                printAnyString("Enter a number:");
                int normal = scanner.nextInt();
                double cosenresult = Coseno(normal);
                printAnyString("The result of cosen is " +cosenresult);


    }

    }
    public static void printAnyString(String message) {
        System.out.println(message);
    }
    public static int sumNumber(int numberOne, int numberTwo){
        int result= numberOne+numberTwo;
        return result;
        //return numberOne+numberTwo
    }
    public static double Coseno (int normal){
        double cosValue = Math.cos(normal);
        return cosValue;
    }

}

