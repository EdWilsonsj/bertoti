package com.example.model;

public class Comida {

    private String nome;
    private double preco;

    public Comida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
}
