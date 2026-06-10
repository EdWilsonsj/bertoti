package com.example.controller;

public class ListaController {

    private AcaoStrategy strategy;

    public void setStrategy(AcaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void executar(Object objeto) {

        if (strategy != null) {
            strategy.executar(objeto);
        }
    }
}