package org.example;

import java.util.Scanner;

import org.example.entity.Boleto;
import org.example.entity.Cartao;
import org.example.entity.Pagamento;
import org.example.entity.Pix;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o pagamento que você quer utilizar:");
        String tipo = sc.next();

        System.out.println("Qual valor que deseja pagar?");
        double valor = sc.nextDouble();

        Pagamento pagamento;

        if(tipo.equalsIgnoreCase("PIX")){
            pagamento = new Pix();
            pagamento.pagar(valor);

        } 
        else if(tipo.equalsIgnoreCase("CARTÃO")){
            pagamento = new Cartao();
            pagamento.pagar(valor);

        }
        else if(tipo.equalsIgnoreCase("BOLETO")){
            pagamento = new Boleto();
            pagamento.pagar(valor);
            
        } else{
            System.out.println("Pagamento inválido!");
        }

        sc.close();
    }
}
