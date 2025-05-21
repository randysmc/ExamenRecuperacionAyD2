package org.example.Refactor.strategy;



/*
* USAMOS STRATEGY PARA PODER REALIZAR CALCULAR LOS DISTITNTOS TIPOS DE FIGURAS
* ESTO NOS PERMITE PODER MODIFICAR CADA FIGURA DE UNA MANERA MAS EFICIENTE
* IMPLEMENTANDO ESTA INTERFAZ
*
* */

public interface ShapeStrategy {

    double calculateArea(double... dimensions);
}
