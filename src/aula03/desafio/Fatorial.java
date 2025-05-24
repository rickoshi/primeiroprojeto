package aula03.desafio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ambas variáveis começam iguais
        // O contador é diminuido em cada iteração e numero é multiplicado
        int numeroUsuario = scanner.nextInt();
        int contador = numeroUsuario;

        while (contador > 1) {
            contador--;
            numeroUsuario *= contador;
        }
        System.out.println(numeroUsuario);


        // numero já começa com o valor do usuário e contador começa como 1
        // O contador é aumentado a cada iteração e numero é multiplicado
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
