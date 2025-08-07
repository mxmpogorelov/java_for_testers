package ru.pogorelov.geometry.figures;

public class Triangle {

    private static double TrianglePoluPerimeter(double a, double b, double c) {
        return ((a + b + c) / 2);
    }

    public static void printTriangleArea(double a, double b, double c) {
        var text = String.format("Площадь треугольника со сторнами %f и %f и %f = %f", a, b, c, TriangleArea(a, b, c), TrianglePoluPerimeter(a, b, c));
        System.out.println(text);


    }
    private static double TriangleArea(double a, double b, double c) {
        return Math.sqrt(((a + b + c)/2) * (((a + b + c)/2) - a) * (((a + b + c)/2) - b) * (((a + b + c)/2) - c));

    }

    public static void printTrianglePerimeter(double a, double b, double c) {
        var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, TrianglePerimetr(a, b, c));
        System.out.println(text);
    }

    private static double TrianglePerimetr(double a, double b, double c) {
        return a + b + c;
    }
}
