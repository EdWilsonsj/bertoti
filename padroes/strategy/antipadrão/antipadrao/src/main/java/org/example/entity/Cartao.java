package org.example.entity;

public class Cartao extends Pagamento {

    @Override
    public void pagar(double pago){
        System.out.println("Pagamento feito com a taxa de 10%!");

    }
    
}
