package com.example.systemDesign.strategy_pattern.withStrategypattern.strategy;

public class PassengerDriveStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("PASSENGER DRIVE CAPABILITY");
    }
}
