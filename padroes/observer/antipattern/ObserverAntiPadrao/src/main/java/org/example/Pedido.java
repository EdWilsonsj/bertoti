package org.example;

public class Pedido {

    private String cliente;
    private Double valor;
    private Integer quantidade;

    public Pedido(String cliente, Double valor, Integer quantidade) {
        this.cliente = cliente;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
