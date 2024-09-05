package Ejercicios;

import java.util.Arrays;

public class MaximoTresNumeros {
    /*Máximo de tres números
    *Descripción: Dados los números a = 5, b = 12 y c = 9,
    *  encuentra cuál de ellos es el mayor.
    * Variables: a = 5, b = 12, c = 9.
    */

    public static void main(String[] args) {
        int  a = 5;
        int b = 12;
        int c = 9;
        int [] d = new int[]{a , b , c};
        Arrays.sort(d);// ordena los numeros
        System.out.println(Arrays.toString(d));
    }
}
