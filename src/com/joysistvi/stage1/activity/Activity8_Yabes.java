package com.joysistvi.stage1.activity;

import java.util.Scanner;

public class Activity8_Yabes {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numbers = new int[5];

            System.out.println("Enter 5 numbers:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("\nYou entered:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }

            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }

            double average = (double) sum / numbers.length;

            int highest = numbers[0];
            int lowest = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > highest) {
                    highest = numbers[i];
                }

                if (numbers[i] < lowest) {
                    lowest = numbers[i];
                }
            }

            // Display results
            System.out.println("\nSum = " + sum);
            System.out.println("Average = " + average);
            System.out.println("Highest = " + highest);
            System.out.println("Lowest = " + lowest);

            scanner.close();
        }
    }

