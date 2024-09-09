package Ejercicios;

public class Ejercicio29 {
    public static void main(String[] args) {
        double a = 64;
        double b = Math.sqrt(a);

        if (a == b*b) {
            System.out.println("El numero "+a+" es un cuadrado perfecto");
        }
        else {
            System.out.println("El numero "+a+" no es un cuadrado perfecto");
        }

    }
}
