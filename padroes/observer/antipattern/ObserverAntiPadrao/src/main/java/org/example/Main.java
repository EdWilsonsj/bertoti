package org.example;

public class Main {

    public static void main(String [] args){
        Pedido pedido = new Pedido("Johnatan", 100.00, 2);
        Estoque estoque = new Estoque(100);
        EnvioEmail env = new EnvioEmail();
        Subject sub = new Subject(estoque, env);

        sub.setPedido(pedido);
        sub.atualizar();
    }
}
