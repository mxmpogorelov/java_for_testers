package ru.pogorelov.geometry;

import ru.pogorelov.geometry.figures.Rectangle;
import ru.pogorelov.geometry.figures.Square;
import ru.pogorelov.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square (7.0));
        Square.printSquareArea(new Square (0.5));
        Square.printSquareArea(new Square (0.3));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle.printTriangleArea(6.0, 8.0, 10.0);
        Triangle.printTrianglePerimeter(1., 2., 3.);
    }
}