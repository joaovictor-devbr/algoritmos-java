package exercicio6;

import java.util.Scanner;

public class CaixaEletronico {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo = 1000;
        double depositar = 0;
        double sacar = 0;

        int opcoes = 0;

        while (opcoes <= 3){
            System.out.println("Escolha uma opção: ");

            opcoes = scanner.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Consultar saldo: " + saldo);
                    break;

                case 2:
                    System.out.println("Depositar: ");
                    depositar = scanner.nextDouble();

                    depositar = depositar + saldo;
                    break;

                case 3:
                    System.out.println("Sacar");
                    sacar = scanner.nextDouble();

                    sacar = saldo - sacar  ;
                    break;

                case 4:
                    System.out.println("Sair");
            }

        }

        }
    }

