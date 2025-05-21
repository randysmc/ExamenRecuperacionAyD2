package org.example.Refactor.strategy;

public class TriangleStrategy implements ShapeStrategy {

    @Override
    public double calculateArea(double... dimension) {
        return dimension[0] * dimension[1]/2;
    }
}
