package Ejercicios;

public class CuadradoPerfecto {
    /**
     * Descripción: Determina si el número a = 64 es un cuadrado perfecto.
     * Un cuadrado perfecto es un número que es el resultado de multiplicar
     * un entero por sí mismo. En este caso, 8 × 8 = 64.
     * Variables: a = 64.
     */

    public static void main(String[] args) {
        int numero = 64;
        double sqrt = Math.sqrt(numero);
        if (sqrt == Math.floor(sqrt)) {
            System.out.println(numero + " es un cuadrado perfecto.  "+ sqrt);
        } else {
            System.out.println(numero + " no es un cuadrado perfecto.");
        }
    }
}
