package aula02;

public class CastingDoubleParaInt {
    public static void main(String[] args) {
        double varDouble = 12.567;
        int varInt = (int) varDouble;
        System.out.printf("Variável double %f convertida para int %d", varDouble, varInt);
    }
}