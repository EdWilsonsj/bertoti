package org.example;

public class Estoque {

    private Integer quantidade;

    public Estoque(Integer quantidade){
        this.quantidade = quantidade;
    }

    public void atualizar(Pedido pedido){
        this.quantidade = this.quantidade - pedido.getQuantidade();
        System.out.println("Quantidade de estoque: " + this.quantidade);
    }
}
