package org.example.Refactor.strategy;

public class RectangleStrategy implements ShapeStrategy{

    @Override
    public double calculateArea( double... dimension) {
        return dimension[0] * dimension[1];
    }
}
