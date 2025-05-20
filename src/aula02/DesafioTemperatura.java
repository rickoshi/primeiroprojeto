package aula02;

public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaCelcius = 20;
        double temperaturaFahrenheit = (temperaturaCelcius * 1.8) + 32;

        System.out.println("Valor de Celcius para Fahrenheit: " + temperaturaFahrenheit);

        int temperaturaFahrenheitInt = (int) temperaturaFahrenheit;
        System.out.println("Valor Fahrenheit inteiro: " + temperaturaFahrenheitInt);
    }
}