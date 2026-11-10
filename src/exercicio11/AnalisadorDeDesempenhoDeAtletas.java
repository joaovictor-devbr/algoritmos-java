
package exercicio11;

import java.util.Scanner;

public class AnalisadorDeDesempenhoDeAtletas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] tempos = new double[10];

        int quantidadeAtletas = 0;
        int opcao;

        do {

            System.out.println("\n===== DESEMPENHO DOS ATLETAS =====");
            System.out.println("1 - Cadastrar atleta");
            System.out.println("2 - Listar atletas");
            System.out.println("3 - Calcular média");
            System.out.println("4 - Melhor desempenho");
            System.out.println("5 - Pior desempenho");
            System.out.println("6 - Atletas abaixo de 15 segundos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                // 1. Cadastrar atleta
                case 1:

                    if (quantidadeAtletas < 10) {

                        scanner.nextLine();

                        System.out.println("\n===== CADASTRO DE ATLETA =====");
                        System.out.print("Digite o nome do atleta: ");

                        nomes[quantidadeAtletas] = scanner.nextLine();

                        do {

                            System.out.print("Digite o tempo da corrida: ");
                            tempos[quantidadeAtletas] = scanner.nextDouble();

                            if (tempos[quantidadeAtletas] <= 0) {
                                System.out.println("Tempo inválido! Digite novamente.");
                            }

                        } while (tempos[quantidadeAtletas] <= 0);

                        quantidadeAtletas++;

                        System.out.println("Atleta cadastrado com sucesso!");

                    } else {

                        System.out.println("Limite de 10 atletas atingido!");

                    }

                    break;

                // 2. Listar atletas
                case 2:

                    System.out.println("\n===== ATLETAS CADASTRADOS =====");

                    if (quantidadeAtletas == 0) {

                        System.out.println("Sem atletas cadastrados!");

                    } else {

                        for (int i = 0; i < quantidadeAtletas; i++) {

                            System.out.printf(
                                    "Atleta: %s | Tempo: %.2f segundos%n",
                                    nomes[i], tempos[i]
                            );

                        }

                        System.out.println("Total de atletas: " + quantidadeAtletas);

                    }

                    break;

                // 3. Calcular média
                case 3:

                    System.out.println("\n===== MÉDIA DOS TEMPOS =====");

                    if (quantidadeAtletas == 0) {

                        System.out.println("Nenhum atleta cadastrado!");

                    } else {

                        double soma = 0;

                        for (int i = 0; i < quantidadeAtletas; i++) {
                            soma += tempos[i];
                        }

                        double media = soma / quantidadeAtletas;

                        System.out.printf("Média dos tempos: %.2f segundos%n", media);

                    }

                    break;

                // 4. Melhor desempenho
                case 4:

                    System.out.println("\n===== MELHOR DESEMPENHO =====");

                    if (quantidadeAtletas == 0) {

                        System.out.println("Nenhum atleta cadastrado!");

                    } else {

                        int melhorIndice = 0;

                        for (int i = 1; i < quantidadeAtletas; i++) {

                            if (tempos[i] < tempos[melhorIndice]) {
                                melhorIndice = i;
                            }

                        }

                        System.out.println("Atleta: " + nomes[melhorIndice]);
                        System.out.printf(
                                "Melhor tempo: %.2f segundos%n",
                                tempos[melhorIndice]
                        );

                    }

                    break;

                // 5. Pior desempenho
                case 5:

                    System.out.println("\n===== PIOR DESEMPENHO =====");

                    if (quantidadeAtletas == 0) {

                        System.out.println("Nenhum atleta cadastrado!");

                    } else {

                        int piorIndice = 0;

                        for (int i = 1; i < quantidadeAtletas; i++) {

                            if (tempos[i] > tempos[piorIndice]) {
                                piorIndice = i;
                            }

                        }

                        System.out.println("Atleta: " + nomes[piorIndice]);
                        System.out.printf(
                                "Pior tempo: %.2f segundos%n",
                                tempos[piorIndice]
                        );

                    }

                    break;

                // 6. Atletas abaixo de 15 segundos
                case 6:

                    System.out.println("\n===== ATLETAS ABAIXO DE 15 SEGUNDOS =====");

                    if (quantidadeAtletas == 0) {

                        System.out.println("Nenhum atleta cadastrado!");

                    } else {

                        int atletasAbaixoDe15 = 0;

                        for (int i = 0; i < quantidadeAtletas; i++) {

                            if (tempos[i] < 15) {

                                System.out.printf(
                                        "Atleta: %s | Tempo: %.2f segundos%n",
                                        nomes[i], tempos[i]
                                );

                                atletasAbaixoDe15++;

                            }

                        }

                        if (atletasAbaixoDe15 == 0) {
                            System.out.println("Nenhum atleta abaixo de 15 segundos.");
                        } else {
                            System.out.println(
                                    "Total de atletas abaixo de 15 segundos: "
                                            + atletasAbaixoDe15
                            );
                        }

                    }

                    break;

                // 0. Sair
                case 0:

                    System.out.println("Encerrando o programa...");

                    break;

                default:

                    System.out.println("Opção inválida! Tente novamente.");

                    break;

            }

        } while (opcao != 0);

        scanner.close();

    }

}
