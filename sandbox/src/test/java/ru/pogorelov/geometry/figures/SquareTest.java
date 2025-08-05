package ru.pogorelov.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void canCalculateArea() {
        double result = Square.SquareArea(5.0);
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimetr(){
        Assertions.assertEquals(20.0, Square.perimeter(5.0));
    }

}
