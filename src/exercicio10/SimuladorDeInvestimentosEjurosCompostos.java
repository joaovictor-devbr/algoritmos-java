package exercicio10;

import java.util.Scanner;

public class SimuladorDeInvestimentosEjurosCompostos {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capital = 0;
        double juros = 0;

        double deposito = 0;
        int meses = 0;
        double saldoAtual = 0;

        System.out.println("1. Capital inicial: ");
        capital = scanner.nextDouble();

        System.out.println("2. Taxa de juros mensal: ");
        juros =  scanner.nextDouble();

        System.out.println("3. Depósito mensal: ");
        deposito =  scanner.nextDouble();

        System.out.println("4. Quantidade de meses: ");
        meses = scanner.nextInt();

        saldoAtual = capital;

        double[] saldos = new double[meses];

        for (int i = 0; i < meses; i++){

            saldoAtual = saldoAtual * (1 + juros / 100.0) + deposito;

            saldos[i] = saldoAtual;

            System.out.printf("Mês %d: R$ %.2f%n", i + 1, saldoAtual);

        }

        System.out.println("\n--- HISTÓRICO DO INVESTIMENTO ---");

        for (int i = 0; i < saldos.length; i++) {
            System.out.printf("Mês %d: R$ %.2f%n", i + 1, saldos[i]);
        }

        double totalInvestido = 0;

        totalInvestido = capital + (deposito * meses);
        System.out.printf("Total Investido: R$ %.2f%n", totalInvestido);

        double rendimento = saldoAtual - totalInvestido;

        System.out.printf("Total de rendimento: %.2f%n", rendimento);

        System.out.printf("Saldo final do invesrtimento: R$ %.2f%n", saldoAtual);

    }
}
