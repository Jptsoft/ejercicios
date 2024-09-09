package Ejercicios;

public class TablaDeMultiplicar {
    /**
     * 25. Generar tabla de multiplicar     *
     * Descripción: Genera la tabla de multiplicar del número a = 7.      *
     * Variables: a = 7.
     */

    public static void main(String[] args) {
        int numero = 7;
        for (int i = 0; i <= 12; i++) {
            int mult = i * numero;
            System.out.println(numero + " x " + i +" = " + mult);
        }
    }
}
