package com.joysistvi.stage2.Activity13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("USER ACCOUNT REGISTRATION\n");

        System.out.println("Enter First Name: ");
        String firstname = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        System.out.println("Enter Email: ");
        String email = input.nextLine();
        System.out.println("Enter Password: ");
        String password = input.nextLine();

        UserAccount users = new UserAccount(firstname, lastName, address , email, password);

        System.out.println("\nUSER ACCOUNT CREATED\n");
        System.out.println("Full Name: " + users.getFirstName() + " " + users.getLastName());
        System.out.println("Address: " + users.getAddress());
        System.out.println("Email: " + users.getEmail());
    }
}
