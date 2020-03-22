package com.kodilla.kodillacoursecalculator;

public class Program {

    public static void main(String args[]) {

        Calculator calculator = new Calculator(5, 3);
        System.out.println(calculator.addXY());
        System.out.println();
        System.out.println(calculator.subXY());
    }
}
