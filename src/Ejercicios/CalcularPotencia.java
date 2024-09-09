package Ejercicios;

public class CalcularPotencia {

    /*
    * 18. Calcular potencia
    * Descripción: Dado el número a = 2 y la potencia b = 8,
    * calcula , es decir, 2 elevado a la potencia de 8.
    * Variables: a = 2, b = 8.
    */

    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        double resultado = Math.pow(a, b);
        System.out.println(a + " elevado a " + b + " es " + resultado);
    }
}
