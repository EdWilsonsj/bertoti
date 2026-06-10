package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Fruta> frutas = new ArrayList<>();
    private List<Comida> comidas = new ArrayList<>();
    private List<Bebida> bebidas = new ArrayList<>();
    private double total;
    
    public void addFruta(Fruta fruta){
        frutas.add(fruta);
    }

    public void addComida(Comida comida){
        comidas.add(comida);
    }

    public void addBebidas(Bebida bebida){
        bebidas.add(bebida);
    }

    public void calcularPreco(){
        
        for(Fruta fruta: frutas){
            total += fruta.getPreco();
        }

        for(Comida comida: comidas){
            total += comida.getPreco(); 
        }

        for(Bebida bebida: bebidas){
            total += bebida.getPreco();
        }

        this.exibirPreco(total);
    }

    private void exibirPreco(double preco){
        System.out.printf("O preco total dos produtos: R$ %.2f%n", preco);
    }

}
