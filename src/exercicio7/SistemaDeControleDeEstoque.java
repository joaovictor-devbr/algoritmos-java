package exercicio7;

import java.util.Scanner;

public class SistemaDeControleDeEstoque {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int estoque = 50;
        int entrada = 0;
        int saida = 0;

        int opcoes = 0;

        boolean executando = true;

        while (executando){

            System.out.println("\n1 - Consultar estoque" +
                    "\n2 - Entrada de produtos" +
                   " \n3 - Saída de produtos" +
                  "  \n4 - Verificar estoque\n" +
                    "5 - Sair"
            );

            opcoes = scanner.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Consultar estoque: "+ estoque);
                    break;

                case 2:
                    System.out.println("Entrada de produtos: ");
                    entrada = scanner.nextInt();
                    if (entrada > 0){
                        estoque = estoque + entrada;
                        System.out.println("Entrada confirmada com sucesso!");
                    }else {
                        System.out.println("Quantidade é inválida");
                    }
                    break;

                case 3:
                    System.out.println("Saida de produtos: ");
                    saida = scanner.nextInt();
                    if (saida > 0 && saida <= estoque){
                        estoque = estoque - saida;
                        System.out.println("Saída confirmada com sucesso!");
                    }else {
                        System.out.println("Estoque Insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("Verificar estoque: ");

                    if (estoque == 0){
                        System.out.println("Estoque zerado: "+ estoque );
                    } else if (estoque <= 10) {
                        System.out.println("Estoque baixo: "+ estoque);
                    }else {
                        System.out.println("Estoque normal: "+ estoque);
                    }
                    break;

                case 5:
                    System.out.println("Sair");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");


            }
        }
    }
}
