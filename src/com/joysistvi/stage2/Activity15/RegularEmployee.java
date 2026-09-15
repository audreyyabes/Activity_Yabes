package com.joysistvi.stage2.Activity15;


public abstract class RegularEmployee extends Employee implements Bonusable, Auditable{
    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;
    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }
    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }
    @Override
    public double computeBonus() {
        return baseSalary * 0.05;
    }

    @Override
    public String getEmployeeType(){
        return "Regular Employee";
    }

    public String generateEmployeeId(){
        return "";
    }
    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    public void logSalaryComputation(String employeeId) {
    }

}
