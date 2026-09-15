package com.joysistvi.stage2.Activity15;


import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = {
                new RegularEmployee("Ana ", 15000) {


                    @Override
                    public boolean isEligibleForBonus() {
                        return true;
                    }

                    public void logSalaryComputation(String employeeId) {
                    }

                },
                new SalesEmployee("Ben", 12000, 5000) {

                    @Override
                    protected String generateEmployeeId() {
                        return "";
                    }

                    @Override
                    public boolean isEligibleForBonus() {
                        return true;
                    }
                },
                new ContractualEmployee("Cruz", 160, 75) {
                }
        };
        for (Employee e : employees) {
            e.printPayslip();
            if (e instanceof Bonusable) {
                Bonusable b = (Bonusable) e;
                if (b.isEligibleForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }
            }
            if (e instanceof Auditable) {
                Auditable a = (Auditable) e;
                a.logSalaryComputation(a.generateEmployeeId());
                System.out.println("Audit log: " + e.getEmployeeType().substring(0,3).toUpperCase() +"-" + e.name.toUpperCase()
                + " salary computed");
            }
            System.out.println("--------------------------------");
        }
    }
}




//    public static void main(String[] args) {
//        Employee[] employees = {
//                new RegularEmployee("Ana", 15000) {
//                    @Override
//                    public String getEmployeeType() {
//                        return "";
//                    }
//
//                    @Override
//                    public double computeBonus() {
//                        return 0;
//                    }
//
//                    @Override
//                    public boolean isEligibleForBonus() {
//                        return false;
//                    }
//
//                    @Override
//                    public String generateEmployeeId() {
//                        return "";
//                    }
//
//                    @Override
//                    public void logSalaryComputation(String employeeId) {
//
//                    }
//                },
//                new SalesEmployee("Ben", 12000, 5000) {
//                    @Override
//                    public double computeBonus() {
//                        return 0;
//                    }
//
//                    @Override
//                    public boolean isEligibleForBonus() {
//                        return false;
//                    }
//                },
//                new ContractualEmployee("Cruz", 160, 75) {
//                    @Override
//                    public String getEmployeeType() {
//                        return "";
//                    }
//
//                    @Override
//                    public double computeDeductions() {
//                        return 0;
//                    }
//
//                    @Override
//                    public String generateEmployeeId() {
//                        return "";
//                    }
//
//                    @Override
//                    public void logSalaryComputation(String employeeId) {
//
//                    }
//                }
//        };
//        for (Employee e : employees) {
//            e.printPayslip();
//        }
//    }
//}
