package com.joysistvi.stage2.Activity15;


public abstract class SalesEmployee extends Employee implements Bonusable {
    private double commission;
    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }

    @Override
    public double computeBonus() {
        return commission * 0.10;
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * 0.12;
    }
}
