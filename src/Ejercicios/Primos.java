package Ejercicios;

public class Primos {

    /*4. Números primos
    *Descripción: Dado el número a = 29,
    * determina si es primo.
    * Un número primo solo tiene dos divisores: 1 y él mismo.
    * Variables: a = 29.
    */

    public static void main(String[] args) {
        int a = 8;

        for (int i = 2; i <a; i++) {
            if(a%i==0){
                System.out.println("no es primo");
                System.out.println("es divisible por" + i);
            }
        }
    }
}
