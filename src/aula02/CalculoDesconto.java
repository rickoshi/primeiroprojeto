package aula02;

public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 399.99;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal - (precoOriginal * (percentualDesconto / 100));
        System.out.printf("O preço original é: R$%.2f, o preço com desconto é: R$%.2f",
                precoOriginal, precoComDesconto);
    }
}
