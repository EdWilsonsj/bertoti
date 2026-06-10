package org;

public class EnvioEmail implements Observer {

    @Override
    public void atualizar(Pedido pedido){
        System.out.println("Enviado mensagem para " + pedido.getCliente());
    }
}
