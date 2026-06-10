package org.example;

public class EnvioEmail {

    public void atualizar(Pedido pedido){
        System.out.println("E-mail enviado para: " + pedido.getCliente());
    }
}
