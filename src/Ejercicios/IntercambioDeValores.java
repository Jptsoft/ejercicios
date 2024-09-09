package Ejercicios;

public class IntercambioDeValores {
    /**     *
     * . Intercambio de valores
     * Descripción: Intercambia los valores de a = 5 y b = 10 sin usar una tercera variable auxiliar.
     * Variables: a = 5, b = 10.
     */

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Paso 1: a = a + b -> a = " + a + " + " + b + " -> a = " + (a + b));
        a = a + b;
        System.out.println("Paso 2: b = a - b -> b = " + a + " - " + b + " -> b = " + (a - b));
        b = a - b;
        System.out.println("Paso 3: a = a - b -> a = " + a + " - " + b + " -> a = " + (a - b));
        a = a - b;
    }
}
