package org.example.model;

import org.example.service.CalculatorService;

import java.util.Scanner;

public class Calculator {
    private final User user;

    public Calculator(User user) {
        this.user = user;
    }

    public void startCalculator() {
        System.out.println("Welcome, " + user.getName() + "!");
        System.out.println("Profession: " + user.getProfession());
        System.out.println("Age: " + user.getAge() + " years old\n");

        Scanner sc = new Scanner(System.in);

        boolean continueCalculations = true;
        String operator;

        while (continueCalculations) {
            System.out.println("--CALCULATOR--");
            System.out.println("Choose a operation: \n1 - Sum '+' \n2 - Subtraction '-' \n3 - Multiplication '*' \n4 - Division \n0 - Exit");
            operator = sc.next();

            switch (operator.toLowerCase()) {
                case "1":
                case "+":
                case "sum":
                    CalculatorService.add();
                    break;
                case "2":
                case "-":
                case "subtraction":
                    CalculatorService.subtract();
                    break;
                case "3":
                case "*":
                case "multiplication":
                    CalculatorService.multiply();
                    break;
                case "4":
                case "/":
                case "division":
                    CalculatorService.divide();
                    break;
                case "0":
                case "exit":
                    break;
                default:
                    System.out.println("Invalid operator!");

            }

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String continueChoice = sc.next().toLowerCase();
            continueCalculations = continueChoice.equals("yes") || continueChoice.equals("y");

        }

        System.out.println("Program has been terminated.");
        sc.close();

    }

}
