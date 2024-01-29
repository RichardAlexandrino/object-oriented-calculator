package org.example.service;

import java.util.Scanner;

public class CalculatorService {

    static double num1;
    static double num2;
    static double result;

    static Scanner sc = new Scanner(System.in);

    public static void add() {
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();

        result = num1 + num2;
        System.out.println("Result: " + String.format("%.2f", num1) + " + " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
    }

    public static void subtract() {
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();

        result = num1 - num2;
        System.out.println("Result: " + String.format("%.2f", num1) + " - " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
    }

    public static void multiply() {
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();

        result = num1 * num2;
        System.out.println("Result: " + String.format("%.2f", num1) + " * " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
    }

    public static void divide() {
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();

        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("Result: " + String.format("%.2f", num1) + " / " + String.format("%.2f", num2) + " = " + String.format("%.2f", result));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
}

