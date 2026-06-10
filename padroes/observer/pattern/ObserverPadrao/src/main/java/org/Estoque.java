package org;

public class Estoque implements Observer{

    private Integer quantidade;

    public Estoque(Integer quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public void atualizar(Pedido pedido){
        this.quantidade = quantidade - pedido.getQuantidade();
        System.out.println("Quantidade em estoque: " + quantidade );
    }
}
