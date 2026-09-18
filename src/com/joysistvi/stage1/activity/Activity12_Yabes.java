package com.joysistvi.stage1.activity;

public class Activity12_Yabes {
    static void oddEven(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }
    static void printName50Times() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Audrey Mey Yabes");
        }
    }
    static void squareRoot(double number) {
        System.out.println("Square root: " + Math.sqrt(number));
    }
    static void power(double base, double exponent) {
        System.out.println("Answer: " + Math.pow(base, exponent));
    }
    static void randomNumber() {
        int number = (int)(Math.random() * 100) + 1;
        System.out.println("Random number: " + number);
    }
    static void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    static void voter(int age) {
        if (age >= 18)
            System.out.println("You are a voter.");
        else
            System.out.println("You are not a voter.");
    }

    static void wordLength(String word) {
        System.out.println("Length: " + word.length());
    }

    static void reverseWord(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println("Reverse: " + reverse);
    }

    static void printInfo(String name, int age) {
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        oddEven(10);
        printName50Times();
        squareRoot(25);
        power(2, 3);
        randomNumber();
        circleArea(5);
        voter(18);
        wordLength("Java");
        reverseWord("Hello");
        printInfo("Your Full Name", 18);
    }
}
