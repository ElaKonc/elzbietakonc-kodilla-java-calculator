package com.kodilla.kodillacoursecalculator;

public class Calculator {

    private double x;
    private double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double addXY() {
        return x + y;
    }

    public double subXY() {
        return x - y;
    }
}
