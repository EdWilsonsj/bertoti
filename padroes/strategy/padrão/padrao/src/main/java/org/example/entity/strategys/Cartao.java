package org.example.entity.strategys;

import java.util.Scanner;

public class Cartao implements FormaDePagamento {

    @Override
    public void pagar(double valor){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Escolha o tipo de cartão: ");
            System.out.println("[1] - Débito");
            System.out.println("[2] - Crédito");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Pagamento feito com cartão de débito! Valor:" + valor);    
                break;
                case 2:
                    System.out.println("Pagamento feito com cartão de crédito com 10% de taxa! Valor: " + (valor + valor * 0.10));
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        } catch (Exception e) {
            System.out.println("Erro ao pagar com o cartão: "+ e.getMessage());
        }
    }
    
}
