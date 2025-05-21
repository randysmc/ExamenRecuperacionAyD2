package org.example.Refactor.strategy;


/*
* LO MISMO PARA TRIANGULO, IMPLEMENTA DE SHAPESTRATEGY
*
* */
public class TriangleStrategy implements ShapeStrategy {

    @Override
    public double calculateArea(double... dimension) {
        return dimension[0] * dimension[1]/2;
    }
}
