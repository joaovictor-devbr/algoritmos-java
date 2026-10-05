package exercicio05;

import java.util.Scanner;

public class analisadordeVendas {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidades de vendas: ");
        int totalVenda = scanner.nextInt();

        double valorVenda = 0;
        double totalVendido = 0;
        double media = 0;

        int vendasAbaixoDe100 = 0;
        int vendasEntre100E500 = 0;
        int vendasAcimaDe500 = 0;

        for (int i = 1; i <= totalVenda; i++) {

            System.out.println("Valor da venda " + i);
            valorVenda = scanner.nextDouble();

            totalVendido = totalVendido + valorVenda;

            if (valorVenda < 100){
                vendasAbaixoDe100++;
            } else if ((valorVenda >= 100) && (valorVenda<= 500) ) {
                vendasEntre100E500++;
            }else {
                vendasAcimaDe500++;
            }
        }


        media = totalVendido / totalVenda;

        System.out.println("\ntotal Vendido: " + totalVendido +
                "\nMédia por venda: " + media);

        System.out.println("\nVendas abaixo de R$ 100: " + vendasAbaixoDe100 +
                "\nVendas entre R$ 100 e R$ 500: " + vendasEntre100E500 +
                "\nVendas acima de R$ 500: " + vendasAcimaDe500);
    }
}
