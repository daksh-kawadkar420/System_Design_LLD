package com.example.systemDesign.strategy_pattern.withStrategypattern.strategy;

public class OffRoadDriveStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("OFFROAD DRIVE CAPABILITY");
    }
}
