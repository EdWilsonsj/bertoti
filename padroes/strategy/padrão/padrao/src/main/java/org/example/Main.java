package org.example;

import org.example.entity.Pagamento;
import org.example.entity.strategys.Boleto;
import org.example.entity.strategys.Cartao;
import org.example.entity.strategys.Pix;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento = new Pagamento(new Pix());

        // Pagamento em PIX
        pagamento.realizarPagamento(30);

        // Pagamento em Cartão
        pagamento.setFormaDePagamento(new Cartao());
        pagamento.realizarPagamento(50);

        // Pagamento em Boleto
        pagamento.setFormaDePagamento(new Boleto());
        pagamento.realizarPagamento(75);

    }
}
