package org.example.entity.strategys;

public class Pix implements FormaDePagamento {
    
    @Override
    public void pagar(double valor){
        System.out.printf("Pagamento concluído! Valor: %.2f %n", valor);
    }

}
