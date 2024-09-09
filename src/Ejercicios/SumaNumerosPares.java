package Ejercicios;

public class SumaNumerosPares {
    /*
    * 17. Suma de números pares en un rango
    * Descripción: Suma todos los números pares entre a = 1 y b = 100.
    * Un número es par si es divisible por 2.
    * Variables: a = 1, b = 100.
    */
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int sumaPares = 0;
        // Calcular la suma de los números pares
        System.out.println("Calculando la suma de los números pares entre " + a + " y " + b + "...");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("sumaPares total= " + sumaPares);
    }

}
