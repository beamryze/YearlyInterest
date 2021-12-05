/*
 *  Assignment 1
 *  Description: Based on user input, calculate the amount of interest earned
 *  Name: Rick
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class YearlyInterest {

   public static void main(String[] args) {

   // Declare Scanner object to have input from user
   // Input for Amount of deposit throughout the year.
   // Input for Yearly Interest Rate.
   // Input for Income Tax Rate.
   // Set way to calculate the interest accrued in a year.
   // Put the interest accrued calculation in a method.
   // Call the method and display the results.

   // Declare object for input.
   Scanner input = new Scanner(System.in);

   // Declare variables to process interest.
   double depositYear, interestRate, incomeTaxRate;

   // Display prompt for amount deposited.
   System.out.print("Enter the amount deposited this year : ");

   // Process input for amount deposited.
   depositYear = input.nextDouble();

   // Display prompt for interest rate.
   System.out.print("Enter the yearly interest rate : ");

   // Process input for interest rate.
   interestRate = input.nextDouble();

   // Display prompt for tax rate.
   System.out.print("Enter the income interest tax rate : ");
   System.out.println();

   // Process input for tax rate.
   incomeTaxRate = input.nextDouble();

   // Call method interestAccrued() to calculate interest earned.
   double resultAccrued = interestAccrued(depositYear, interestRate, incomeTaxRate);

   // Display interest earned from result.
   System.out.println("The amount of interest earned in the year is " + resultAccrued);

    }

    // Method to calculate interest earned.
    public static double interestAccrued(double deposit, double intRate, double taxRate) {

       // Declare variable for accrued amount.
       double amtAccrued;

       // Calculate accrued amount.
       amtAccrued = ((deposit * (intRate / 100)) * ((100-taxRate)/100));

       // Returned accured amount.
       return  amtAccrued;
    }
}
