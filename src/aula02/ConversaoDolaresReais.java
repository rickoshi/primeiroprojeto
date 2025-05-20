package aula02;

public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 59.29;
        double taxaDeConversao = 4.94;
        double valorEmReais = (valorEmDolares * taxaDeConversao);
        System.out.printf("O valor de $%.2f em Dólares fica R$%.2f em Reais",
                valorEmDolares, valorEmReais);
    }
}
