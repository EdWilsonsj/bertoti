package com.example;

import com.example.model.Bebida;
import com.example.model.Carrinho;
import com.example.model.Comida;
import com.example.model.Fruta;

public class Main {

    public static void main(String[] args) {
        Bebida bebida = new Bebida("Coca-cola", 10.0);
        Comida comida = new Comida("Feijão", 14.98);
        Fruta fruta = new Fruta("Maçã", 2.87);

        Carrinho carrinho = new Carrinho();

        carrinho.addBebidas(bebida);
        carrinho.addComida(comida);
        carrinho.addFruta(fruta);

        carrinho.calcularPreco();
    }
    
}
