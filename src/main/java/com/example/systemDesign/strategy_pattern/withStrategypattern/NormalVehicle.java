package com.example.systemDesign.strategy_pattern.withStrategypattern;

import com.example.systemDesign.strategy_pattern.withStrategypattern.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {super(new NormalDriveStrategy());}
}
