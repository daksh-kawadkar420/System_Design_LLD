package com.example.systemDesign.strategy_pattern.withStrategypattern;

import com.example.systemDesign.strategy_pattern.withStrategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {super(new SportsDriveStrategy());}
}
