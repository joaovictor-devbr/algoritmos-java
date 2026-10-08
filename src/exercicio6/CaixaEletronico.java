package exercicio6;

import java.util.Scanner;

public class CaixaEletronico {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000;
        double depositar = 0;
        double sacar = 0;

        int opcoes = 0;

        while (opcoes <= 3){
            System.out.println("\nEscolha uma opção: \n"
                    + "1 - Consultar saldo\n" +
                    "2 - Depositar\n" +
                    "3 - Sacar\n" +
                    "4 - Sair");

            opcoes = scanner.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Consultar saldo: " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor do deposito: ");
                    depositar = scanner.nextDouble();

                    saldo = saldo + depositar;
                    break;

                case 3:
                    System.out.println("Informe o valor do saque: ");
                    sacar = scanner.nextDouble();

                    if (sacar <= saldo){
                        saldo = saldo - sacar;
                        System.out.println("Saque no valor de R$ "+ sacar +" realizado");
                    }else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 4:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }
        }
    }
}

