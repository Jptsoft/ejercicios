package Ejercicios;

public class ConteoDigitosNumeros {
    /*
     *22. Conteo de dígitos de un número
     * Descripción: Cuenta cuántos dígitos tiene el número a = 987654.
     * El resultado sería 6 dígitos.
     * Variables: a = 987654.
     */

    public static void main(String[] args) {
        int numero = 987654;
        int numeroOriginal = numero;
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("El número " + numeroOriginal + " tiene " + contador + " dígitos.");
    }
}
