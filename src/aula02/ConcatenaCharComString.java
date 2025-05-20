package aula02;

public class ConcatenaCharComString {
    public static void main(String[] args) {
        char varChar = 'Z';
        String varString = "A combinação é XY";
        String mensagem = String.format("%s%c", varString, varChar);
        System.out.println(mensagem);
    }
}
