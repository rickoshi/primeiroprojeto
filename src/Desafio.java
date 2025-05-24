import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String nomeConta = "Luna Oshiro";
        String tipoConta = "Corrente";
        double saldoConta = 2500;
        int opcaoUsuario = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nomeConta);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoConta);
        System.out.println("\n*****************************\n");

        String menu = """
                Operações
                
                ** Digite sua opção
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        while (opcaoUsuario != 4) {
            System.out.print(menu);
            opcaoUsuario = scanner.nextInt();

            if (opcaoUsuario == 1) {
                System.out.printf("O saldo atual é R$ %.2f\n\n", saldoConta);
            } else if (opcaoUsuario == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorParaReceber = scanner.nextDouble();
                saldoConta += valorParaReceber;
                System.out.printf("Saldo atualizado R$ %.2f\n\n", saldoConta);
            } else if (opcaoUsuario == 3) {
                System.out.println("Informe o valor que deseja tranferir: ");
                double valorParaTransferir = scanner.nextDouble();
                if (valorParaTransferir > saldoConta) {
                    System.out.println("Não há saldo suficiente para fazer essa tranferência.\n");
                } else {
                    saldoConta -= valorParaTransferir;
                    System.out.printf("Saldo atualizado R$ %.2f\n\n", saldoConta);
                }
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
