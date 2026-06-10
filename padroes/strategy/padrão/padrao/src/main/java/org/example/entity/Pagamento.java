package org.example.entity;

import org.example.entity.strategys.FormaDePagamento;

public class Pagamento {
    
    private FormaDePagamento formaDePagamento;

    public Pagamento(FormaDePagamento formaDePagamento){
        this.formaDePagamento = formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void realizarPagamento(double valor){
        formaDePagamento.pagar(valor);
    }
}
