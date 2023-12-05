package com.practice.www;

public class car {
    // Instance variables
    String model;
    int year;
    double price;

    // Constructor
    public car(String modelParam, int yearParam, double priceParam) {
        model = modelParam;
        year = yearParam;
        price = priceParam;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating instances of the Car class
        car car1 = new car("Toyota Camry", 2022, 25000.0);
        car car2 = new car("Honda Accord", 2021, 28000.0);

        // Displaying information about the cars
        System.out.println("Car 1 Details:");
        car1.displayInfo();

        System.out.println("\nCar 2 Details:");
        car2.displayInfo();
    }
}

