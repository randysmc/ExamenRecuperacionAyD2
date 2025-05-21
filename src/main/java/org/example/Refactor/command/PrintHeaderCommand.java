package org.example.Refactor.command;

public class PrintHeaderCommand implements PrintCommand {
    private String customer;

    //Aqui imprimmimos la información del cliente con el la implementacino de printCommand
    @Override
    public void execute() {
        System.out.println("Order for: " + customer);
    }

    @Override
    public void undo() {

    }
}

