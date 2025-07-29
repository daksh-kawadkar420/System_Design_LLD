package com.example.systemDesign.strategy_pattern.withStrategypattern.strategy;

public class SportsDriveStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("SPORTS DRIVE CAPABILITY");
    }
}
