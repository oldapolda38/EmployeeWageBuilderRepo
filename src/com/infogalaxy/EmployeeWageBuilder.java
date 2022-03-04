package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC-2 Daily Wage Calculation
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        int checkAttendance = random.nextInt()%2;
        if(checkAttendance == 0){
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
            total_wage = FULL_DAY_HR * WAGE_PER_HR;
        }
        System.out.println("Total wage = "+ total_wage);
    }
}
