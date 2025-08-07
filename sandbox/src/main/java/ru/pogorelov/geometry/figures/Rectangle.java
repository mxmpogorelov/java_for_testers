package ru.pogorelov.geometry.figures;

public record Rectangle(double a, double b) {

    public static void printRectangleArea(double a, double b) {
        var text = String.format("Площадь прямоугоника со сторнами %f и %f = %f", a, b, RectangleArea(a, b));
        System.out.println(text);
    }
        private static double RectangleArea ( double a, double b) {
            return a * b;
        }
    }