package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC-1 Employee Attendance
        Random random = new Random();
        int checkAttendance = random.nextInt()%2;
        if(checkAttendance == 0){
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
        }
    }
}
