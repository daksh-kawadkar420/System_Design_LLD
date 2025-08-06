package com.example.systemDesign.factory_pattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        shape.getShape("Circle").draw();
        shape.getShape("Rectangle").draw();
        shape.getShape("Square").draw();
    }
}
