package org.example.Refactor.strategy;

public class CircleStrategy implements ShapeStrategy{

    @Override
    public double calculateArea( double... dimension) {
        return Math.PI * dimension[0] * dimension[0];
    }
}
