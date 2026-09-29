package exercicio1;

import java.util.Scanner;

public class MaiorDosTres {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3){
            System.out.println("Todos são iguais");
        } else if (number1 >= number2 && number1 >= number3) {
            System.out.println("O Primeiro número é maior");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("O Segundo número é maior");
        } else {
            System.out.println("O terceriro é maior");
        }
    }
}
