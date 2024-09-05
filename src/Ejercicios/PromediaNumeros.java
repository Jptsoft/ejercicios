package Ejercicios;

public class PromediaNumeros {
    /*
    * 6. Promedio de tres números
    * Descripción: Dados los números a = 4, b = 9 y c = 13,
    *  calcula el promedio de los tres.
    * Variables: a = 4, b = 9, c = 13. */

    public static void main(String[] args) {
       int a = 4;
       int b = 9;
       int c = 13;
       int suma = a+b+c;
       int promedio =suma / 3;
        System.out.println("el promedio de "+ a + " ,"+ b +", "+ c +" es igual a "+ promedio  );
    }
}
