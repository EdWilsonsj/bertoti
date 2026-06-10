package com.example.controller;

import com.example.model.ListaModel;
import com.example.model.Produto;

public class AdicionarStrategy {

    private final ListaModel model;

    public AdicionarStrategy(ListaModel model) {
        this.model = model;
    }

    public void executar(Produto produto) {
        model.adicionarProduto(produto);
    }
}