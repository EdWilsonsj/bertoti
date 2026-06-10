package com.example.folha;

import com.example.componente.ItemCarrinho;

public class Produto implements ItemCarrinho {

    private double preco;
    private String nome;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco(){
        return this.preco;
    }

    @Override
    public void mostrar(){
        System.out.println("Produto: " + nome + " Preço: " + preco);
    }

    
}
