package com.joysistvi.stage1.activity;

import java.util.Scanner;

public class Activity4_If_Yabes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MAIN MENU");
        System.out.println("1. START GAME");
        System.out.println("2. LOAD GAME");
        System.out.println("3. SETTINGS");
        System.out.println("4. EXIT");

        System.out.println("Enter your choice (1-4): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");
        }
        else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
        }
        else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        }
        else {
            System.out.println( "Invalid choice. Please try again.");
        }


    }
}
