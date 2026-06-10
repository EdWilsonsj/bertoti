package org.example.entity.strategys;

public class Boleto implements FormaDePagamento{

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento realizado com boleto e com taxa de 5%! Valor: " + (valor + valor * 0.05));
    }
    
}
