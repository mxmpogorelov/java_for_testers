package ru.pogorelov.geometry;

import ru.pogorelov.geometry.figures.Rectangle;
import ru.pogorelov.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(0.7);
        Square.printSquareArea(0.5);
        Square.printSquareArea(0.3);

        Rectangle.printRectangleArea(3.0 , 5.0);
        Rectangle.printRectangleArea(7.0 , 9.0);
    }

}