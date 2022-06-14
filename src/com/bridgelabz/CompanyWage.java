package com.bridgelabz;

public class CompanyWage {
    public  String companyName;
    public  int empWagePerHr;
    public  int numMaxWorkingDay;
    public  int maxHrsInMonth;
    public  int totalEmpWage;

    // Constructor
    public CompanyWage(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth) {
        this.companyName = companyName;
        this.empWagePerHr = empWagePerHr;
        this.numMaxWorkingDay = numMaxWorkingDay;
        this.maxHrsInMonth = maxHrsInMonth;
    }

    @Override
    public String toString() {
        return "CompanyWage{" +
                "companyName='" + companyName + '\'' +
                ", empWagePerHr=" + empWagePerHr +
                ", numMaxWorkingDay=" + numMaxWorkingDay +
                ", maxHrsInMonth=" + maxHrsInMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}

