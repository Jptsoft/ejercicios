package Ejercicios;

public class NumeroArmstrong {
    /*
    * 20. Número Armstrong
    * Descripción: Determina si el número a = 153 es un número Armstrong.
    *  Un número Armstrong es igual a la suma de sus dígitos elevados
    * a la potencia del número de dígitos.
    *  Para 153, sería  1 elevadoa 3 mas  5 elevado a 3 mas  3 elevado a 3 , es igual a 153
    * Variables: a = 153.
    */

    public static void main(String[] args) {
        int numero=153;
        int originalNumero = numero;
        int numeroDigitos = (int) Math.log10(numero) + 1;
        int suma = 0;
        while (numero != 0) {
            int digito = numero % 10;
            suma += (int) Math.pow(digito, numeroDigitos);
            numero /= 10;
        }
        if (suma == originalNumero) {
            System.out.println(originalNumero +" es un numero armstrong");
        }
        else {
            System.out.println(originalNumero + " No es un numero armstrong");
        }
    }
}
