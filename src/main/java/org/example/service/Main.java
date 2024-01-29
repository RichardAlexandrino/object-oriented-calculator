package org.example.service;

import org.example.model.Calculator;
import org.example.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Your Name", "Professor", 35);
        Calculator calculator = new Calculator(user);
        calculator.startCalculator();
    }
}