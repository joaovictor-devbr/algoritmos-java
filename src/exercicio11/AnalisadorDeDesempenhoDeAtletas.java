package exercicio11;

import java.util.Scanner;

public class AnalisadorDeDesempenhoDeAtletas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] tempos = new double[10];

        int quantidadeAtletas = 0;

        int opcao;


        while (opcao != 0){
            System.out.printf("===== DESEMPENHO DOS ATLETAS =====\n" +
                    "\n" +
                    "1 - Cadastrar atleta\n" +
                    "2 - Listar atletas\n" +
                    "3 - Calcular média\n" +
                    "4 - Melhor desempenho\n" +
                    "5 - Pior desempenho\n" +
                    "6 - Atletas abaixo de 15 segundos\n" +
                    "0 - Sair");

            switch (opcao){

                //1. Cadastrar atleta
                //O usuário informa:
                //- Nome do atleta.
                //- Tempo que ele levou para completar a corrida, em segundos.
                case 1:
                    if (quantidadeAtletas < 10){
                        System.out.printf("==== CADASTRE O ATLETA ====");

                        scanner.nextLine();

                        System.out.printf("Digite o nome do atleta: ");
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
                        System.out.println("Sem vagas disponíveis!");
                    }
                    break;

               //2. Listar atletas
               //Mostrará todos os atletas cadastrados e seus respectivos tempos.
                case 2:
                    System.out.printf("===== ATLETAS CADASTRADOS =====");
                    scanner.next();
                    break;

                    //3. Calcular média
                //Calculará a média dos tempos de todos os atletas.
                case 3:
                    System.out.printf("Média do atleta: ");
                    break;


                //4. Melhor desempenho
                //Identificará o atleta que completou a corrida no menor tempo.
                case 4:
                    System.out.printf("===== MELHOR DESEMPENHO =====");
                    break;

                case 5:
                    System.out.printf("===== PIOR DESEMPENHO =====");
                    break;

                case 6:
                    System.out.printf("===== ATLETAS ABAIXO DE 15 SEGUNDOS =====");
                    break;

                case 0:
                    System.out.printf("Sair");
            }
        }

    }
}