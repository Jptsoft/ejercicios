package Ejercicios;

public class Primos {

    /*4. Números primos
    *Descripción: Dado el número a = 29,
    * determina si es primo.
    * Un número primo solo tiene dos divisores: 1 y él mismo.
    * Variables: a = 29.
    */

    public static void main(String[] args) {
        int a = 29;
        int divisores;

        for (int i = 1; i <a; i++) {
            if(a%i==0){
                System.out.println(i);
                System.out.println("es impar");
                System.out.println(a%i);
            }
        }
    }
}
