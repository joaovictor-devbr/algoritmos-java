
package exercicio9;

import java.util.Scanner;

public class SenhaSecreta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaSecreta = 67;
        int palpite;
        int tentativas = 0;

        boolean acertou = false;

        while (tentativas < 7 && !acertou) {
            System.out.println("\n===== JOGO DA SENHA SECRETA =====");
            System.out.println("Tentativas restantes: " + (7 - tentativas));
            System.out.print("Digite um número entre 1 e 100: ");

            palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 100) {
                System.out.println("Palpite inválido! Digite entre 1 e 100.");
                continue;
            }

            tentativas++;

            if (palpite == senhaSecreta) {
                System.out.println("PARABÉNS! Você acertou!");
                acertou = true;
            } else if (palpite < senhaSecreta) {
                System.out.println("A senha secreta é maior!");
            } else {
                System.out.println("A senha secreta é menor!");
            }
        }

        if (acertou) {
            System.out.println("Você venceu em " + tentativas + " tentativa(s)!");
        } else {
            System.out.println("Você perdeu! Suas tentativas acabaram.");
            System.out.println("A senha secreta era: " + senhaSecreta);
        }

    }
}
