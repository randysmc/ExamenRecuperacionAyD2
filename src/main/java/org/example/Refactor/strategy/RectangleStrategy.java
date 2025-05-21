package org.example.Refactor.strategy;


/*
* IMPLEMENTA DE SHAPESTRATEGY PARA PODER CALUCULAR SU PROPIA AREA
* */
public class RectangleStrategy implements ShapeStrategy{

    @Override
    public double calculateArea( double... dimension) {
        return dimension[0] * dimension[1];
    }
}
