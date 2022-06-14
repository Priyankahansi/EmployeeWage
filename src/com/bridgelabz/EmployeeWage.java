package com.bridgelabz;

public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int FULL_DAY_HR = 8;
    public static final int PART_DAY_HR = 4;

    private CompanyWage[] CompanyWage= new CompanyWage[5];
    private int numOfCompany = 0;

    public static void main(String[] args) {
        EmployeeWage empWageBuilder = new EmployeeWage();
        empWageBuilder.addCompanyEmpWage("Infosys",20,
                4,10);
        empWageBuilder.addCompanyEmpWage("Dell",20,
                14,20);
        empWageBuilder.computeEmpWageFromArray();
    }

    private void addCompanyEmpWage(String companyName, int empWagePerHr,  int numMaxWorkingDay, int maxHrsInMonth) {
        CompanyWage empWage = new CompanyWage(companyName , empWagePerHr , numMaxWorkingDay , maxHrsInMonth);
        CompanyWage[numOfCompany] = empWage;
        numOfCompany++;
    }
    private void computeEmpWageFromArray() {
        for (int i= 0; i< numOfCompany; i++){
            int totalWage =computeEmpWage(CompanyWage[i]);
            CompanyWage[i].totalEmpWage= totalWage;
            System.out.println(CompanyWage[i]);
        }
    }
    private int computeEmpWage(CompanyWage companyEmpWage) {
        int totalEmpHours = 0, totalWorkingDays = 0, workingHours = 0;
        while (totalEmpHours < companyEmpWage.maxHrsInMonth && totalWorkingDays < companyEmpWage.numMaxWorkingDay) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            // Calculating Wage On Employee Type
            switch ((int) empCheck) {
                case 0:
                    workingHours = FULL_DAY_HR;
                    break;
                case 1:
                    workingHours = PART_DAY_HR;
                    break;
                default:
                    workingHours = 0;
            }
            totalEmpHours += workingHours;
            totalWorkingDays++;
        }
        return totalEmpHours * companyEmpWage.empWagePerHr;
    }
}