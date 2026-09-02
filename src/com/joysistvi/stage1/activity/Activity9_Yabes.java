package com.joysistvi.stage1.activity;

import java.util.Scanner;


public class Activity9_Yabes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("           Average Calculator");
        System.out.println("========================================");

        // Ask for number of students and subjects
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Clear the newline

        // Create arrays
        String[] subjects = new String[numSubjects];
        String[] students = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];

        // Input subject names
        System.out.println();
        System.out.println("Enter subject names:");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
        }

        // Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println();
            System.out.print("Name of Student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextDouble();
            }

            scanner.nextLine(); // Clear the newline
        }

        // Display Grades Report
        System.out.println();
        System.out.println("========================================");
        System.out.println("             Grades Report");
        System.out.println("========================================");

        // Header
        System.out.printf("%-20s", "Student");

        for (String subject : subjects) {
            System.out.printf("%-12s", subject);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("----------------------------------------");

        // Display students, grades, and average
        for (int i = 0; i < numStudents; i++) {

            double sum = 0;

            System.out.printf("%-20s", students[i]);

            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-12.0f", grades[i][j]);
                sum += grades[i][j];
            }

            double average = sum / numSubjects;

            System.out.printf("%-10.2f%n", average);
        }

        scanner.close();
    }
}
