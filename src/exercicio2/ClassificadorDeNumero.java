package exercicio2;

import java.util.Scanner;

public class ClassificadorDeNumero {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Esse número é 0");
        } else {
            if (numero < 0) {
                System.out.println("Esse número é negativo");
            } else {
                System.out.println("Esse número é positivo");
            }

            if (numero % 2 == 0) {
                System.out.println("Esse número é par");
            } else {
                System.out.println("Esse número é ímpar");
            }
        }
        scanner.close();
    }
}
