package Ejercicios;

public class Factorial {

    /*
    * 10. Factorial de un número
    * Descripción: Dado el número a = 6,
    * calcula su factorial.
    * El factorial de un número se obtiene multiplicando
    * todos los números desde 1 hasta el número dado.
    * Variables: a = 6.
    * */

    public static void main(String[] args) {
        int a =6;
        int f=1;
        for (int i = 1; i <= a; i++) {
            System.out.println(" " + i + " * " + f + " es igual ");
            f = f * i;
            System.out.println("factorial = " + f);
        }
    }
}
