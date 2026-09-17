package com.joysistvi.stage2.Activity16;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n To‑Do List Manager \n");
            System.out.println("1. Add a task ");
            System.out.println("2. View all tasks ");
            System.out.println("3. Update a task ");
            System.out.println("4. Remove a task ");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit \n");
            System.out.println("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: // add
                    System.out.println("Add a task: ");
                    String addTasks = input.next();

                    tasks.add(addTasks);
                    System.out.println(addTasks + " Added successfully");
                    break;


                case 2: // view
                    System.out.println("View All Task\n");
                    if (tasks.isEmpty()) {
                        System.out.println("No Task Available.");
                    } else {
                        tasks.forEach(System.out::println);
                    }
                    break;

                case 3: //update
                    if (tasks.isEmpty()) {
                        System.out.println("No Task to update");
                        break;
                    } else {
                        System.out.println("Enter task index to update: ");
                        int updateTaskIndex = input.nextInt();
                        input.nextLine();
                        if (updateTaskIndex >= 0 && updateTaskIndex < tasks.size()){
                            System.out.println("Enter new Task: ");
                            String updatedTaskName = input.nextLine();

                            tasks.set(updateTaskIndex, updatedTaskName);

                            System.out.println("Task " + updateTaskIndex + " "+ updatedTaskName + " updated successfully!");
                        } else {
                            System.out.println("Invalid index");
                        }
                    }
                    break;

                case 4: // delete
                    if (tasks.isEmpty()) {
                        System.out.println("No Task to delete");
                        break;
                    }

                    System.out.print("Enter task index to remove: ");
                    int removeIndex = input.nextInt();
                    input.nextLine();

                    if (removeIndex >= 0 && removeIndex < tasks.size()) {
                        tasks.remove(removeIndex);

                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks have been cleared.");
                    break;
                case 0:
                    System.out.println("Exiting Todo Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 0);
        input.close();

    }
}
