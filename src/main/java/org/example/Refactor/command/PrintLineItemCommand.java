package org.example.Refactor.command;


//Aqui utilzamos la implementacino de Command para poder imprimir los items

public class PrintLineItemCommand implements PrintCommand{

    private String item;


    @Override
    public void execute() {
        System.out.println(" - Item: " + item);
    }

    @Override
    public void undo() {

    }
}
