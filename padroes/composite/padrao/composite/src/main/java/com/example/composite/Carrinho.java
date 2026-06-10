package com.example.composite;

import java.util.ArrayList;
import java.util.List;

import com.example.componente.ItemCarrinho;

public class Carrinho implements ItemCarrinho{
    
    private String nome;
    List<ItemCarrinho> itens = new ArrayList<>();

    public Carrinho(String nome){
        this.nome = nome;
    }

    public void add(ItemCarrinho produto){
        itens.add(produto);
    }

    public void remove(ItemCarrinho produto){
        itens.remove(produto);
    }

    @Override
    public double getPreco(){
        double total = 0;

        for(ItemCarrinho item: itens){
             total += item.getPreco();
        }
        return total;
    }

    @Override
    public void mostrar() {

        System.out.println("Carrinho: " + nome);
        
        for(ItemCarrinho itemCarrinho: itens){
            itemCarrinho.mostrar();
        }
    }
    
}
