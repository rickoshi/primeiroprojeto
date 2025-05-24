package aula03.desafio;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numeroUsuario = scanner.nextInt();
        int contador = 0;

        while (contador < 10) {
            contador++;
            System.out.println(numeroUsuario * contador);
        }
    }
}
