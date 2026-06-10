package org.example;

public class Subject {

    private Pedido pedido;
    private Estoque estoque;
    private EnvioEmail envioEmail;

    public Subject(Estoque estoque, EnvioEmail envioEmail){
        this.estoque = estoque;
        this.envioEmail = envioEmail;
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public void atualizar(){
        estoque.atualizar(pedido);
        envioEmail.atualizar(pedido);
    }
}
