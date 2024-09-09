package Ejercicios;

public class PalindromoDeUnNumero {
    /*
    * 13. Palíndromo de un número
    * Descripción: Determina si el número a = 1221 es palíndromo,
    * es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
    * Variables: a = 1221.
    */

    public static void main(String[] args) throws InterruptedException {
        int numero = 1221;
        int numeroOriginal = numero;
        int numeroInvertido = 0;
        // Invertimos el número
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        System.out.println("numeroOriginal = " + numeroOriginal);
        System.out.println("numeroInvertido = " + numeroInvertido);
        // Comparamos el número original con el invertido
        if (numeroOriginal == numeroInvertido) {
            System.out.println("!!! es Palindromo ¡¡¡");;
        }
        else {
            System.out.println("No es palindromo ");
        }
    }
}
