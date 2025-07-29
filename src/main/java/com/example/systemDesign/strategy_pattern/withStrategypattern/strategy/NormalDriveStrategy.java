package com.example.systemDesign.strategy_pattern.withStrategypattern.strategy;

public class NormalDriveStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("NORMAL DRIVE CAPABILITY");
    }
}
