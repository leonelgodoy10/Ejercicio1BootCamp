package Ejercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
        int a = 45;
        int b = a;
        String binario = "";

        while (a > 0) {
            binario = (a % 2) + binario;
            a /= 2;
        }

        System.out.println("El número decimal " + b + " en binario es: " + binario);
    }
}
