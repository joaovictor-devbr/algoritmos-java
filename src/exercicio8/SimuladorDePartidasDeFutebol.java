package exercicio8;

import java.util.Scanner;

public class SimuladorDePartidasDeFutebol {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] gols = new int[2];
        int[] golsTime1 = new int[100];
        int[] golsTime2 = new int[100];

        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        int totalGols1 = 0;
        int totalGols2 = 0;
        int golsDaPartida = 0;
        int partidasRegistradas = 0;

        int opcoes = 0;

        boolean executando = true;

        while (executando) {
            System.out.println("\n===== SIMULADOR DE PARTIDAS =====" +
                    "\n1 - Registrar partida" +
                    "\n2 - Ver estatísticas" +
                    "\n3 - Ver histórico de partidas" +
                    "\n0 - Sair");

            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("1 - Registrar partida");

                    System.out.println("Quantidade de gols do primeiro time: ");
                    gols[0] = scanner.nextInt();

                    System.out.println("Quantidade de gols do segundo time: ");
                    gols[1] = scanner.nextInt();

                    if (gols[0] < 0 || gols[1] < 0) {
                        System.out.println("Valores incorretos!!!\n" +
                                "Números negativos não são aceitos");
                    } else {
                        System.out.println("Placar da partida: "
                                + gols[0] + " x " + gols[1]);

                        totalGols1 = totalGols1 + gols[0];
                        totalGols2 = totalGols2 + gols[1];
                        golsDaPartida = gols[0] + gols[1];
                        partidasRegistradas++;
                        golsTime1[partidasRegistradas - 1] = gols[0];
                        golsTime2[partidasRegistradas - 1] = gols[1];

                        System.out.println("Total de partidas: "
                                + partidasRegistradas + " partidas");

                        if (gols[0] > gols[1]) {
                            System.out.println("Quantidade de gols do jogo: "
                                    + golsDaPartida +
                                    "\nVitória do primeiro time!");
                            vitorias++;

                        } else if (gols[0] < gols[1]) {
                            System.out.println("Quantidade de gols do jogo: "
                                    + golsDaPartida +
                                    "\nDerrota do primeiro time e vitória do segundo time");
                            derrotas++;

                        } else {
                            System.out.println("Empate!!!");
                            empates++;
                        }
                    }
                    break;

                case 2:
                    System.out.println("2 - Ver estatísticas");
                    System.out.println("\nTotal de partidas registradas: "
                            + partidasRegistradas);
                    System.out.println("Quantidade de vitórias do primeiro time: "
                            + vitorias);
                    System.out.println("Quantidade de empates: " + empates);
                    System.out.println("Quantidade de derrotas do primeiro time: "
                            + derrotas);
                    System.out.println("Total de gols marcados pelo primeiro time: "
                            + totalGols1);
                    System.out.println("Total de gols sofridos pelo primeiro time: "
                            + totalGols2);
                    System.out.println("Saldo de gols: "
                            + (totalGols1 - totalGols2));

                    if (partidasRegistradas > 0) {
                        System.out.printf("Aproveitamento do time: %.2f%%%n",
                                (((double)(vitorias * 3) + empates) /
                                        (partidasRegistradas * 3)) * 100);
                    } else {
                        System.out.println("Ainda não há partidas registradas " +
                                "para calcular o aproveitamento.");
                    }
                    break;

                case 3:
                    System.out.println("3 - Histórico de partidas");

                    if (partidasRegistradas == 0){
                        System.out.println("Nenhuma partida registrada.");
                    } else {
                        for (int i = 0; i < partidasRegistradas; i++){
                            System.out.println("Partida " + (i + 1) + ": "
                                    + golsTime1[i] + " x " + golsTime2[i]);
                        }
                    }
                    break;

                case 0:
                   System.out.println("0 - Sair");

                   executando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}