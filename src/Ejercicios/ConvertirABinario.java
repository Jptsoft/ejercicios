package Ejercicios;

public class ConvertirABinario {

    /*14. Conversión de decimal a binario
    *Descripción: Dado el número decimal a = 45,
    *  conviértelo a binario.
    * Variables: a = 45. */

    public static void main(String[] args) {
        int decimal = 25;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("El número decimal " + decimal + " en binario es: " + binary);
    }
}
