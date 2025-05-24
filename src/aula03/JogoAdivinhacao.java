package aula03;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroUsuario = 0;
        int contador = 0;

        while (contador < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroUsuario = entrada.nextInt();
            contador++;

            if (numeroAleatorio < numeroUsuario) {
                System.out.println("O número aleatório é menor");
            } else if (numeroAleatorio > numeroUsuario) {
                System.out.println("O número aleatório é maior");
            } else {
                System.out.println();
                System.out.printf("Você acertou o número aleatório em %d tentativas", contador);
                break;
            }
        }
        if (contador == 5 && numeroAleatorio != numeroUsuario ) {
            System.out.println();
            System.out.println("Você não conseguiu acertar o número aleatório");
            System.out.printf("O número era: %d", numeroAleatorio);
        }
    }
}
