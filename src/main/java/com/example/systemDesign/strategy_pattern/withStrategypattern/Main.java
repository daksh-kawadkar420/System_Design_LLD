package com.example.systemDesign.strategy_pattern.withStrategypattern;

public class Main {
    public static void main(String[] args) {
//      FOR SPORTS DRIVE
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

//      FOR NORMAL DRIVE
        Vehicle vehicle1 = new NormalVehicle();
        vehicle1.drive();

    }
}
