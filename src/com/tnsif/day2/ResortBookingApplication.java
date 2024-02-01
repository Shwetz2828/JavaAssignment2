package com.tnsif.day2;

import java.util.Scanner;

class Booking {
    private String customerName;
    private int numAdults;
    private int numChildren;
    private int numDays;

    public Booking(String customerName, int numAdults, int numChildren, int numDays) {
        this.customerName = customerName;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.numDays = numDays;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public int getNumDays() {
        return numDays;
    }

    public double calculateTotalCost() {
        if (numAdults < 0) {
            System.out.println("Invalid input for the number of adults");
            return -1;
        }

        if (numChildren < 0) {
            System.out.println("Invalid input for the number of children");
            return -1;
        }

        if (numDays <= 0) {
            System.out.println("Invalid input for the number of days");
            return -1;
        }

        double adultPrice = 1000 * numAdults * numDays;
        double childPrice = 650 * numChildren * numDays;

        return adultPrice + childPrice;
    }
}

public class ResortBookingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the customer details");
            String input = scanner.nextLine();

            // Parsing input
            String[] inputArray = input.split(":");
            String customerName = inputArray[0];
            int numAdults = Integer.parseInt(inputArray[1]);
            int numChildren = Integer.parseInt(inputArray[2]);
            int numDays = Integer.parseInt(inputArray[3]);

            // Creating Booking object
            Booking booking = new Booking(customerName, numAdults, numChildren, numDays);

            // Calculating and displaying the total cost
            double totalCost = booking.calculateTotalCost();
            if (totalCost != -1) {
                System.out.println(customerName + " your booking is confirmed, and the total cost is " + totalCost);
            }
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}
