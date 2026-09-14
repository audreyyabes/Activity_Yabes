package com.joysistvi.stage2.Activity14;

public class ContractualEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    public ContractualEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }
}
