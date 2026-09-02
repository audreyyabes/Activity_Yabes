package com.joysistvi.stage1.activity;

import java.util.Scanner;

public class Activity9_Part2_Yabes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //String country = "Philippines";
        System.out.println("Enter Country: ");
        String country = input.next();

        // Display first and last character
        char firstCharacter = country.charAt(0);
        char lastCharacter = country.charAt(country.length() - 1);

        System.out.println("Country: " + country);
        System.out.println("First character: " + firstCharacter);
        System.out.println("Last character: " + lastCharacter);

        // Count P/p
        int pCount = 0;

        for (int i = 0; i < country.length(); i++) {
            char character = country.charAt(i);

            if (character == 'P' || character == 'p') {
                pCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);

        // Count vowels
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {
            char character = country.charAt(i);

            if (character == 'a' || character == 'e' ||
                    character == 'i' || character == 'o' ||
                    character == 'u' || character == 'A' ||
                    character == 'E' || character == 'I' ||
                    character == 'O' || character == 'U') {

                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);
    }
}
