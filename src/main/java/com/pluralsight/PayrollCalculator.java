package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.next();

        System.out.print("How many hours did you work? ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("what's your pay rate ");
        float payRate = scanner.nextFloat();

        float grossPay = 0;

        if (hoursWorked > 40) {
            grossPay += (payRate * 1.5f) * hoursWorked;
        } else {
            grossPay += payRate * hoursWorked;
        }

        System.out.println(name + " your gross pay for this week is " + grossPay);
    }
}
