package org.example.Refactor.command;

public class PrintTotalCommand implements  PrintCommand{
    private double total;


    @Override
    public void execute() {
        System.out.println("Total: $" + total);
    }

    @Override
    public void undo() {

    }
}
