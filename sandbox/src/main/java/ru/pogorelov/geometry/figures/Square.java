package ru.pogorelov.geometry.figures;

public class Square {
    public static void printSquareArea(double a) {
        System.out.println("Площадь квадрата со стороной " + a + " = " + SquareArea(a));
    }

    public static double SquareArea(double a) {
        return a * a;
    }
}
