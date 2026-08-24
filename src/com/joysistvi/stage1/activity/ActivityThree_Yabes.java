package com.joysistvi.stage1.activity;

public class ActivityThree_Yabes {
    public static void main(String[] args) {
        // 2
        int age;
        boolean hasValidId;
        age = 18;
        hasValidId = true;

        // 3
        boolean isWeekend;
        boolean isHoliday;

        isHoliday = true;
        isWeekend = true;

        // 4
        int score = 75;

        // 5
        int numberOne = 30;
        int numberTwo = 25;

        // 2
        String allowed = age >= 18 && hasValidId ? "Yes" : "No";
        System.out.println("");
        System.out.println("TASK 2: Event Entry Check");
        System.out.println("Allow to enter the event: " + allowed);

        // 3
        String noClassesResult = isHoliday || isWeekend ? "No classes" : "Yes";
        System.out.println("");
        System.out.println("TASK 3: Class Status Check");
        System.out.println("Are there no classes today? " + noClassesResult);

        // 4
        String scoreResult = score >= 75 ? "Passed": "Failed";
        System.out.println("");
        System.out.println("TASK 4: Pass or Fail Check");
        System.out.println("Score: " + scoreResult);
        System.out.println("Result: " + score);

        // 5
        int largerNumber = numberOne >= numberTwo || numberTwo <= numberOne ? numberOne : numberTwo ;
        System.out.println("");
        System.out.println("TASK 5: Larger Number Check");
        System.out.println("Number 1: " + numberOne);
        System.out.println("Number 2: " + numberTwo);
        System.out.println("The Larger Number is: " + largerNumber);

    }
}
