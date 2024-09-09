package Ejercicios;

public class SumarDigitosDeUnNumero {

    /*
    * Sumar dígitos de un número
    * Descripción: Dado el número a = 5678,
    * suma todos sus dígitos.
    * El resultado sería 5 + 6 + 7 + 8 = 26.
    * Variables: a = 5678.
    */

    public static void main(String[] args) {
        int numero = 5678;
        int numeroOriginal = numero;
        int suma = 0;
        while (numero != 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }
        System.out.println("numeroOriginal = " + numeroOriginal);
        System.out.println("suma = " + suma);
    }
}
