package Ejercicios;


public class NumerosPerfectos {
    /*
    * 19 Descripción: Determina si el número a = 28 es un número perfecto.
    * Un número perfecto es aquel cuya suma de sus divisores
    * (excluyendo el número mismo) es igual al número.
    * Variables: a = 28.
    */

    public static void main(String[] args) {
        int numero = 28;
        int sumaDivisores = 0;
        System.out.println("\nProceso de cálculo de divisores:");
        // Iteramos desde 1 hasta la mitad del número
        for (int i = 1; i < numero ; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                System.out.println("Divisor: " + i + ", Suma de divisores actual: " + sumaDivisores);
            }
        }
        if (sumaDivisores == numero) {
            System.out.println("es numero perfecto");
        }
        else {
            System.out.println("no es un numero perfecto");
        }
    }
}
