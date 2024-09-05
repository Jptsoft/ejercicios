package Ejercicios;

public class ConversionTemperatura {

    /*Conversión de temperatura
    *Descripción: Dado que la temperatura es c = 25 grados Celsius,
    *  conviértela a Fahrenheit usando la fórmula:
    * Variables: c = 25.
    * */

    public static void main(String[] args) {
        int c = 25;
        int f = ((9 / 5) * c) + 32;
        System.out.println("temperatura Fahrenheit es "+f);
    }
}
