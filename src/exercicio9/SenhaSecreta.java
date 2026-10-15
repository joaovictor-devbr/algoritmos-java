package exercicio9;

import java.util.Scanner;

public class SenhaSecreta {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaSecreta = 67;
        int palpite = 0;
         int tentativas = 0;

         boolean acertou = false;

        while (tentativas < 7 && !acertou){
            System.out.println("===== JOGO DA SENHA SECRETA =====");
            System.out.println("Digite seu palpite:");
            palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 100){
                System.out.println("Senha tem que ser acima de 1 e abaixo de 100!");
            }else {
                if (palpite == senhaSecreta){
                    System.out.println("PARABÉNS! Você acertou!");
                    acertou = true;
                    tentativas++;
                }else {
                    if (palpite < senhaSecreta){
                        System.out.println("A senha secreta é maior!");
                        tentativas++;
                    } else {
                        System.out.println("A senha secreta é menor!");
                        tentativas++;
                    }
                }
            }
        }
    }
}
