package com.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListaModel implements Subject {

    private final ObservableList<Produto> produtos = FXCollections.observableArrayList();

    private final List<Obs> observers =
            new ArrayList<>();

    public ObservableList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        notificarObservers();
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        notificarObservers();
    }

    @Override
    public void adicionarObserver(Obs obs) {
        observers.add(obs);
    }

    @Override
    public void removerObserver(Obs observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
       for(Obs obs: observers){
            obs.update();
       }
    }
}