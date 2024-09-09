package Ejercicios;

public class Fibonacci {

    /*
    * 11. Fibonacci
    * Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci,
    *  donde cada número es la suma de los dos anteriores.
    *  La secuencia comienza con 0 y 1.
    * Variables: N = 10.
    */

    public static void main(String[] args) {
        int N = 10;
        int num1 = 0;
        int num2 = 1;
        // Muestra el resultado
        System.out.print("Los primeros " + N + " números de Fibonacci son: ");
        for (int i = 1; i <= N; ++i) {
            System.out.print(num1 + " ");
            // Actualiza los números para la siguiente iteración
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
    }
}
