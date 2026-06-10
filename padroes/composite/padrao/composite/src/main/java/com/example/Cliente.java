package com.example;

import com.example.componente.ItemCarrinho;
import com.example.composite.Carrinho;
import com.example.folha.Produto;

public class Cliente {
    
    public static void main(String[] args) {
        
        ItemCarrinho carrinho = new Carrinho("Mercado");

        ItemCarrinho produto = new Produto("Arroz", 27.89);
        ItemCarrinho produto2 = new Produto("Feijão", 50.89);

        ItemCarrinho carrinho2 = new Carrinho("Eletrônicos");
        ItemCarrinho produto3 = new Produto("Teclado", 120.56);
        ((Carrinho) carrinho2).add(produto3);

        ((Carrinho) carrinho).add(produto);
        ((Carrinho) carrinho).add(produto2);

        ((Carrinho) carrinho).add(carrinho2);

        carrinho.mostrar();

    }
}