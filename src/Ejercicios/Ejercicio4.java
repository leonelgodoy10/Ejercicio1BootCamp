package Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 29;
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println(numero + (esPrimo ? " es" : " no es") + " un número primo.");
    }
}
