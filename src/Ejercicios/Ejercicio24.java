package Ejercicios;

public class Ejercicio24 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i <= 50; i+=3) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("La suma de los multiplos de 3 es :"+sum);
    }
}
