package Ejercicios;

public class SumaNumerosNaturales {
    /*
    * Descripción: Dado el número N = 50,
    * calcula la suma de los primeros N números naturales.
    * Los números naturales son los enteros positivos comenzando desde 1.
    * Variables: N = 50.
    * */

    public static void main(String[] args) {
        int num = 50;
        int suma=0;
        for (int i = 1; i <= num; i++) {
            System.out.println("i = " + i);
            suma = suma + i;
            System.out.println("suma = " + suma);
        }
    }
}
