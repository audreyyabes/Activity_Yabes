package com.joysistvi.stage1.activity;

import java.util.Scanner;

public class Activity6_Yabes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;
        int attempts = 0;
        int maxAttempts = 3;

        for (; !isLoggedIn && attempts < maxAttempts; ) {
            System.out.print("Enter email: ");
            String LoginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String LoginPass = scanner.nextLine();

            attempts++;

            if (LoginEmail.equals(email) && LoginPass.equals(password)) {
                System.out.println("Login Successfully!");
                isLoggedIn = true;
            } else {
                System.out.println("Invalid Username or Password!");
                if (attempts < maxAttempts){
                    System.out.println("Attempts remaining: " + (maxAttempts - attempts));
                }
                else {
                    System.out.println("Too many failed attempts. Account locked!");
                    scanner.close();
                }
            }
        }
        //scanner.close();
    }
}
