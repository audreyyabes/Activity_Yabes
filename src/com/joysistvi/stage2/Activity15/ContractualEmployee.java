package com.joysistvi.stage2.Activity15;


public abstract class ContractualEmployee extends Employee implements Auditable{
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

    @Override
    public String getEmployeeType() {
        return "Contractual Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * 0.05;
    }

    @Override
    public String generateEmployeeId() {
        return "";
    }

    @Override
    public void logSalaryComputation(String employeeId) {

    }

}
