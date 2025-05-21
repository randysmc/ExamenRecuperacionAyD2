package org.example.Refactor.command;

public interface PrintCommand {

    //Utilizamos command aqui para poder realizar distintos tipos de acciones
    //Como ejecutar o revertir

    void execute();
    void undo();
}
