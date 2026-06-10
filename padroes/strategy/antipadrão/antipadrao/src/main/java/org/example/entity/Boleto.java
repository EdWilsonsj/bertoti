package org.example.entity;

public class Boleto extends Pagamento {

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento feito com taxa de 15%!");
       
    }
}
