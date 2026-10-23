package exercicio10;

import java.util.Scanner;

public class SimuladorDeInvestimentosEjurosCompostos {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capital = 0;
        double taxa = 0;
        double deposito = 0;
        int meses = 0;

        System.out.println("1. Capital inicial: ");
        capital = scanner.nextDouble();

        System.out.println("2. Taxa de juros mensal: ");
        taxa =  scanner.nextDouble();

        System.out.println("3. Depósito mensal: ");
        deposito =  scanner.nextDouble();

        System.out.println("4. Quantidade de meses: ");
        meses = scanner.nextInt();

        double[] saldos = new double[meses];
    }
}
