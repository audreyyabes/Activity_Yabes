package com.joysistvi.stage1.activity;

import java.util.Scanner;

public class Activity5_Yabes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 5000.00;

        System.out.println("\nSimple ATM Menu\n");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposits");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit\n");
        System.out.println("Enter your choice (1-4): ");
        int atmChoice = input.nextInt();

        if (atmChoice == 1){
            System.out.println("Your current balance is: " + balance);
        } else if (atmChoice == 2){
            System.out.println("Enter amount to deposit: ");
            double depositAmount = input.nextDouble();
                if (depositAmount <= 0) {
                    System.out.println("Error");
                }
                else {
                    System.out.println("Deposit Successful");
                    System.out.println("New Balance: " + (balance + depositAmount));
                }

        } else if (atmChoice == 3){
            System.out.println("Enter amount to Withdraw: ");
            double withdrawAmount = input.nextDouble();
                if (balance >= withdrawAmount) {
                    System.out.println("Deposit Successful");
                    System.out.println("New Balance: " + (balance - withdrawAmount));
                } else {
                    System.out.println("You don't have enough balance, Please ty again");
                }
        } else if (atmChoice == 4) {
            System.out.println("Thank you for using this ATM. Goodbye!");
        } else {
            System.out.println("Invalid Input");
        }


    }
}
