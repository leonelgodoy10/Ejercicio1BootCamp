package Ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {
        int numero = 5678;
        int suma = 0;

        while (numero != 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
