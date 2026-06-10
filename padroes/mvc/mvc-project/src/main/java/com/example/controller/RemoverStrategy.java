package com.example.controller;

import com.example.model.ListaModel;
import com.example.model.Produto;

public class RemoverStrategy {

    private final ListaModel model;

    public RemoverStrategy(ListaModel model) {
        this.model = model;
    }

    public void executar(Produto produto) {
        model.removerProduto(produto);
    }
}