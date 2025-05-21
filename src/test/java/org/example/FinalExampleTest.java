package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.matches;
import static org.mockito.BDDMockito.given;

public class FinalExampleTest {


    private FinalExample finalExample;
    private FinalExample.Order order;
    private FinalExample.ReportGenerator reportGenerator;

    // para los prints
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    //-------

    private final String NAME_USER = "Randy";
    private final String EMAIL_USER = "randy@gmail.com";
    private final String PHONE_USER = "123456";
    private final String INVALID_EMAIL = "randy.com";
    private final String ADDRESS_USER = "Zona 1";
    private final String CITY_USER = "Quetzaltenango";
    private final String ZIP_USER= "0901";
    private final String ITEM = "item";
    private final double TOTAL = 12.0;


    @BeforeEach
    void setUp(){
        finalExample = new FinalExample();
        order = finalExample.new Order();
        reportGenerator = finalExample.new ReportGenerator();
        System.setOut(new PrintStream(outContent));
    }

    // Despues de cada test
    @AfterEach
    void tearDown(){
        System.setOut(originalOut);
        outContent.reset();
    }


    @Test
    void processDataEntradaVacia(){
        //Arrange
        String input = "";
        String expectedOutput = "Data processed:\nTotal items:\n";

        //Act
        finalExample.processData(input);

        //Assert
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void processDataTextoValido(){
        //Arrange
        String input = "banana";
        String expectedOutPut = "Data processed:\n- BANANA\nTotal items:\n- BANANA\n";

        //Act
        finalExample.processData(input);

        //
        assertEquals(expectedOutPut, outContent.toString());
    }

    @Test
    void processDataTextoLargo(){
        //Arrange
        String input = "cadenamuylarga, banana";
        String expectedOutput = "Data processed:\n- CADENAMUYL\n- BANANA\nTotal items:\n- CADENAMUYL\n- BANANA\n";

        //act
        finalExample.processData(input);

        //A
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void processDataTextoNoAlfabetico(){
        //Arrange
        String input = "123, banana, 456";
        String expectedOutput = "Data processed:\n- BANANA\nTotal items:\n- BANANA\n";

        //Act
        finalExample.processData(input);

        //Ass
        assertEquals(expectedOutput, outContent.toString());
    }


    @Test
    void crearUsuarioExitosamente(){
        //Arrange
        String expected = "User created: " + NAME_USER;

        //Act
        String result = finalExample.createUser(NAME_USER, EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void crearUsuarioNombreNull(){
        //Arragne
        String expected = "Name cannot be empty";

        //Act
        String result = finalExample.createUser(null, EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //assesrt
        assertEquals(expected, result);
    }

    @Test
    void crearUsuarioNombreVacio(){
        //Arrange
        String expected = "Name cannot be empty";

        //Act
        String result = finalExample.createUser("", EMAIL_USER, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER );

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void crearUsuarioEmailNull(){
        //Arrange
        String expected = "Invalid email";

        //Act
        String result = finalExample.createUser(NAME_USER, null, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void crearUsuarioInvalidEmail(){
        //Arrange
        String expected = "Invalid email";

        //Act
        String result = finalExample.createUser(NAME_USER, INVALID_EMAIL, PHONE_USER, ADDRESS_USER, CITY_USER, ZIP_USER);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void reportGeneratorPrintHeader(){
        //Arrange
        String customer = NAME_USER;
        String expected = "Order for: " + customer + "\n";

        //Act
        reportGenerator.printHeader(customer);

        //Assert
        assertEquals(expected, outContent.toString());

    }

    @Test
    void reportGeneratorPrintLineItem(){
        //Arr
        String item = ITEM;
        String expected = " - Item: " + item + "\n";

        //Act
        reportGenerator.printLineItem(item);

        //Assert
        assertEquals(expected, outContent.toString());
    }

    @Test
    void reportGeneratorPrintTotal(){
        //Arrange
        double total = TOTAL;
        String expected = "Total: $" + total + "\n";

        //Act
        reportGenerator.printTotal(total);

        //Assert
        assertEquals(expected, outContent.toString());
    }

    //----------------
    @Test
    void calcularAreaCirculo(){
        //Arrange
        double radius = 1.0;
        double expected = Math.PI;

        //act
        double result = finalExample.calculateArea("circle", radius);

        //assert
        assertEquals(expected, result, 0.01);
    }

    void calcularAreaRectanguloExitosamente(){
        //Arrange
        double width = 2.0;
        double height = 3.0;
        double expected = 6.0;

        //act
        double result = finalExample.calculateArea("rectangle", width, height);

        //As
        assertEquals(expected, result, 0.01);
    }

    @Test
    void calcularAreaTriangulo(){
        //Arrange
        double base = 2.0;
        double height = 3.0;
        double expected = 3.0;

        //act
        double result = finalExample.calculateArea("triangle", base, height);

        //Assert
        assertEquals(expected, result, 0.01);
    }


    @Test
    void calcularAreaDesconocidad(){
        //
        String shape = "square";

        //Act Assert
        assertThrows(IllegalArgumentException.class, ()-> finalExample.calculateArea(shape, 1.0));
    }



}
