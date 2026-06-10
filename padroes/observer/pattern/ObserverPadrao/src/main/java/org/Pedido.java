package org;

public class Pedido {

    private String cliente;
    private Integer quantidade;
    private Double valor;

    public Pedido(String cliente, Integer quantidade, Double valor){
        this.cliente = cliente;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

}
