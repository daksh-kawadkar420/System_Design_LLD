package com.example.systemDesign.strategy_pattern.withStrategypattern;

import com.example.systemDesign.strategy_pattern.withStrategypattern.strategy.Drive;
import com.example.systemDesign.strategy_pattern.withStrategypattern.strategy.NormalDriveStrategy;
import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
    Drive driveObj;

    public Vehicle(Drive drive) {
        this.driveObj = drive;
    }

    public void drive() {
        driveObj.drive();
    }

}
