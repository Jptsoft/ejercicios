package Ejercicios;

public class ValorAbsoluto {
    /**
     * 26. Valor absoluto
     * Descripción: Determina el valor absoluto del número a = -15.
     * El valor absoluto es la distancia de un número al 0, ignorando su signo.
     * Variables: a = -15.
     */

    public static void main(String[] args) {
        int numero = -15;
        int valorAbsolutoMath = Math.abs(numero);
        System.out.println("El valor absoluto de " + numero + " usando Math.abs() es: " + valorAbsolutoMath);
    }
}
