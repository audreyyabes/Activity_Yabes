package com.joysistvi.stage1.activity;

public class ActivityTwo_Yabes {
    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        double foodPercentage = (foodAllowance / income) * 100;
        double transportationPercentage = (transportation / income) * 100;
        double rentPercentage = (rent / income) * 100;
        double utilityPercentage = (utilityBill / income) * 100;

        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Display results
        System.out.println("Income: " + income);
        System.out.println();

        System.out.printf("Food Allowance: %.1f%%%n", foodPercentage);
        System.out.printf("Transportation: %.1f%%%n", transportationPercentage);
        System.out.printf("Rent: %.1f%%%n", rentPercentage);
        System.out.printf("Utility Bill: %.1f%%%n", utilityPercentage);

        System.out.println();
        System.out.printf("Total Expenses: %.2f%n", totalExpenses);
        System.out.printf("Remaining Balance: %.2f%n", remainingBalance);
    }



}
