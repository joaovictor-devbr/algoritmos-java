package exercicio3;

import java.util.Scanner;

public class ClassificadorDeDesempenho {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeDoAluno = scanner.nextLine();
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3.0;

        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)){
            System.out.println("Notas Inválidas");

        } else if (media == 10){
            System.out.println("Aluno(a): " + nomeDoAluno +
                    "\nSua média é: " + media + "\nSituação: aprovado com ótimo desempenho");
        } else if (media >= 9){
            System.out.println("Aluno(a): " + nomeDoAluno +
                    "\nSua média é: " + media + "\nSituação: aprovado com desempenho muito bom");
        } else if (media >= 7) {
            System.out.println("Aluno(a): " + nomeDoAluno +
                    "\nSua média é: " + media + "\nSituação: aprovado");
        } else if (media >= 5 ) {
            System.out.println("Aluno(a): " + nomeDoAluno +
                    "\nSua média é: " + media + "\nSituação: recuperação");
        } else {
            System.out.println("Aluno(a): " + nomeDoAluno +
                    "\nSua média é: " + media + "\nSituação: reprovado");
        }
    }
}
