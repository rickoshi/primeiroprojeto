package aula01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        double notaDoFilme = 8.1;
        System.out.printf("Nota do filme: %.2f", notaDoFilme);
        System.out.println();

        // Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);
        System.out.println();


        /*
        Comparação de Strings

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
        System.out.println();
         */


        /*
        Text Blocks
        Recurso disponível a partir do Java 15
        Com ele, é possível pular linhas dentro da própria variável
        */
        String sinopseTextBlock = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopseTextBlock);
        System.out.println();


        /*
        Formatação de textos
        format(), da classe String
        .formatted(), para text block

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais",
            nome, idade, valor);
        System.out.println();

        String name = "João";
        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(name, aulas);
        System.out.println(mensagem);
         */


        // Convertendo valores double para int
        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}