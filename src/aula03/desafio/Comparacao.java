package aula03.desafio;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int numeroUsuario1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numeroUsuario2 = scanner.nextInt();

        if (numeroUsuario1 == numeroUsuario2) {
            System.out.println("Os números são iguais");
        } else if (numeroUsuario1 > numeroUsuario2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}
