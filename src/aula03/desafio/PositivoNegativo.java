package aula03.desafio;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Numero negativo");
        }
    }
}
