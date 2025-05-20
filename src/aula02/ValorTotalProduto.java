package aula02;

public class ValorTotalProduto {
    public static void main(String[] args) {
        double precoProduto = 5.89;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.printf("O valor total é: R$%.2f", valorTotal);
    }
}
