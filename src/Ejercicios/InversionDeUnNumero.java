package Ejercicios;

public class InversionDeUnNumero {
    /*
    * 12. Inversión de un número
    * Descripción: Dado el número a = 54321,
    *  invierte el orden de sus dígitos.
    * El resultado sería 12345.
    * Variables: a = 54321.
    */

    public static void main(String[] args) {
        int a =54321;
        int numeroOriginal = a;
        int numeroInvertido = 0;
        while (a != 0) {
            int digito = a % 10; // Obtiene el último dígito.
            numeroInvertido = numeroInvertido * 10 + digito; // Agrega el dígito al número invertido.
            a /= 10; // Elimina el último dígito del número original.
        }
        System.out.println("Número Original: " + numeroOriginal + " | Número Invertido: " + numeroInvertido);
    }
}
