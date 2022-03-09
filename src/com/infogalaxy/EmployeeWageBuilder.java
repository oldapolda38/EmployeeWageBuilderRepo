package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC-2 Daily Wage Calculation
        final int WAGE_PER_HR = 20;
        final int FULL_TIME_HR = 8;
        final int PART_TIME_HR = 4;
        int total_wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        int checkAttendance = random.nextInt()%2;
        if(checkAttendance == 0){
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
            int empType = random.nextInt()%2;
            switch(empType) {
                case 0:
                    System.out.println("Employee is Part Time.");
                    total_wage = WAGE_PER_HR * PART_TIME_HR;
                    break;
                case 1:
                case -1:
                    System.out.println("Employee is Full Time.");
                    total_wage = WAGE_PER_HR * FULL_TIME_HR;
                    break;
            }
        }
        System.out.println("Total wage = "+ total_wage);
    }
}
