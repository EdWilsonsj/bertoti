package org;

public class Main {

    public static void main(String[] args) {
        Subject sub = new Subject();
        Estoque estoque = new Estoque(50);
        EnvioEmail env = new EnvioEmail();

        Pedido pedido01 = new Pedido("Johnatan", 4, 60.00);

        sub.addObserver(estoque);
        sub.addObserver(env);

        sub.notificar(pedido01);

    }
}
