package com.mycompany.act2;
import java.util.Scanner;

public class ACT2 {

    public static void main(String[] args) {
         Scanner scanner =new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        
        int numsubjects=scanner.nextInt();
        
        if (numsubjects<=0){
            System.out.println("Number of Subjects should be greater than zero.");
            return;    
        }
        
        double totalgrades = 0;
        int failedsubjects =0;
        
        double grades = 0;
        
        for (int i = 0; i < numsubjects; i++){
            System.out.print("Enter the Grade for the Subject " + (i +1)+": ");
            grades= scanner. nextInt();
            
            if (grades  < 60){
                failedsubjects++;
            }
            totalgrades += grades;
        }
        double averagegrades = totalgrades/ numsubjects;
        
        System.out.println("Average Grade: " + averagegrades);
        
        if (averagegrades >= 90){
            System.out.print("\r\nPerformance Welldone! ");
        }
        else if (averagegrades >= 80){
            System.out.print("\r\nPerformance Salutaions! ");
        }
        else if (averagegrades >= 70){
            System.out.print("\r\nPerformance Mid! ");
        }
        else if (averagegrades >= 60){
            System.out.println("\r\nPerformance needs iprovement! ");
        }
        else {
            System.out.println("\r\nperformance FAIL! ");
        }
        System.out.println("\r\nNumbers of Failed Subject: " + failedsubjects);
        
        scanner.close();
            }
}
