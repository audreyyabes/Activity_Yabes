package com.joysistvi.stage1.activity;

import java.util.Scanner;

public class Activity7_part1_Yabes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int numberToMultiply = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = i * numberToMultiply;
            System.out.println(i + " * " + numberToMultiply + " = " + product);
        }

    }
}
