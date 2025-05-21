package org.example.Refactor.strategy;


/*
* CIRCULO IMPLEMENTA CALCULAR AREA DE SHAPESTRATEGY LO QUE LE PERMITE REALIZAR
* SU PROPIO CALCULO MODIFICANDO SU MISMO METODO
* */
public class CircleStrategy implements ShapeStrategy{

    @Override
    public double calculateArea( double... dimension) {
        return Math.PI * dimension[0] * dimension[0];
    }
}
