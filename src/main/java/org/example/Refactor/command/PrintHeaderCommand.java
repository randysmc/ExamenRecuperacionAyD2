package org.example.Refactor.command;

public class PrintHeaderCommand implements PrintCommand {
    private String customer;

    @Override
    public void execute() {
        System.out.println("Order for: " + customer);
    }
}

