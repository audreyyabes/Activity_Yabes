package com.joysistvi.stage1.activity;

public class Activity7_part2_Yabes {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }
            System.out.println();
        }
    }

}
