package org.example.Refactor.command;

public class PrintLineItemCommand implements PrintCommand{

    private String item;


    @Override
    public void execute() {
        System.out.println(" - Item: " + item);
    }
}
