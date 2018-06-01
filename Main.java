package com.benbprograms.caclulator;
import java.util.Scanner;
import java.lang.Math;
public class Main
{

    public static void main(String[] args)
    {
        double number1, number2, answer;
        int operation;

        Scanner GetNumbers = new Scanner(System.in);
        System.out.println("1)  add          2)   subtract");
        System.out.println("3)  multiply     4)   divide");
        System.out.println("5)  square       6)   square root");
        System.out.println("7)  cube         8)   cube root");
        System.out.println("9)  power        10)  round");
        System.out.println("11) round up     12)  round down");
        System.out.print("enter the number of the operation you want: ");
        operation = GetNumbers.nextInt();
        switch (operation)
        {
            case 1:
                System.out.print("enter the first number: ");
                number1 = GetNumbers.nextDouble();
                System.out.print("enter the second number: ");
                number2 = GetNumbers.nextDouble();
                answer = number1 + number2;
                System.out.print(number1 + " + " + number2 + " = " + answer);
                break;
            case 2:
                System.out.print("enter the first number: ");
                number1 = GetNumbers.nextDouble();
                System.out.print("enter the second number: ");
                number2 = GetNumbers.nextDouble();
                answer = number1 - number2;
                System.out.print(number1 + " - " + number2 + " = " + answer);
                break;
            case 3:
                System.out.print("enter the first number: ");
                number1 = GetNumbers.nextDouble();
                System.out.print("enter the second number: ");
                number2 = GetNumbers.nextDouble();
                answer = number1 * number2;
                System.out.print(number1 + " * " + number2 + " = " + answer);
                break;
            case 4:
                System.out.print("enter the first number: ");
                number1 = GetNumbers.nextDouble();
                System.out.print("enter the second number: ");
                number2 = GetNumbers.nextDouble();
                answer = number1 / number2;
                System.out.print(number1 + " / " + number2 + " = " + answer);
                break;
            case 5:
                System.out.print("enter the number: ");
                number1 = GetNumbers.nextDouble();
                answer = Math.pow(number1,2);
                System.out.print("the square of " + number1 + " is " + answer);
                break;
            case 6:
                System.out.print("enter the number: ");
                number1 = GetNumbers.nextDouble();
                answer = Math.sqrt(number1);
                System.out.print("the square root of " + number1 + " is " + answer);
                break;
            case 7:
                System.out.print("enter the number: ");
                number1 = GetNumbers.nextDouble();
                answer = Math.pow(number1,3);
                System.out.print("the cube of " + number1 + " is " + answer);
                break;
            case 8:
                System.out.print("enter the number: ");
                number1 = GetNumbers.nextDouble();
                answer = Math.cbrt(number1);
                System.out.print("the cube root of " + number1 + " is " + answer);
                break;
            case 9:
                System.out.print("enter the number to be raised : ");
                number1 = GetNumbers.nextDouble();
                System.out.print("enter the exponent: ");
                number2 = GetNumbers.nextDouble();
                answer = Math.pow(number1, number2);
                System.out.print(number1 + " ^ " + number2 + " = " + answer);
                break;
            case 10:
                System.out.print("enter the number: ");
                number1 = GetNumbers.nextDouble();
                answer = Math.round(number1);
                System.out.print("the cube root of " + number1 + " is " + answer);
                break;
            case 11:
                System.out.print("enter the number: ");
                number1 = GetNumbers.nextDouble();
                answer = Math.ceil(number1);
                System.out.print(number1 + " rounded up is " + answer);
                break;
            case 12:
                System.out.print("enter the number: ");
                number1 = GetNumbers.nextDouble();
                answer = Math.floor(number1);
                System.out.print(number1 + " rounded down is " + answer);
                break;

                default:
                System.out.print("please enter a number: ");

        }
    }
}