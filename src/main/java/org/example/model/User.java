package org.example.model;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class User {
    private String name;
    private String profession;
    private int age;

    Scanner sc = new Scanner(System.in);

    public User(String name, String profession, int age) {
        System.out.println("Enter your username: ");
        this.name = sc.nextLine();
        System.out.println("Enter your profession: ");
        this.profession = sc.nextLine();
        System.out.println("Enter your age: ");
        this.age = sc.nextInt();
    }

    public String getName() {
        return name = this.name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }
}

