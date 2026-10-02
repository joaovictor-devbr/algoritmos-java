package exercicio4;

import java.util.Scanner;

public class AnalisadordeNúmero {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número inteiro");
        int number = scanner.nextInt();


            if (number < 0) {
                System.out.println("Esse número é negativo");
            } else if (number == 0) {
                System.out.println("Esse número é zero");}
            else {
                System.out.println("Esse número é positivo");
            }

             if (number % 2 == 0){
                System.out.println("Esse número é par");
            } else {
                System.out.println("Esse número é impar");
            }

            if (number % 5 == 0) {
                System.out.println("Esse número é múltiplo de 5");
            } else {
                System.out.println("Esse número não é múltiplo de 5");
            }
        }
    }

