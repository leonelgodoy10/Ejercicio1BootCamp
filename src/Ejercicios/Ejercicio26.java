package Ejercicios;

public class Ejercicio26 {
    public static void main(String[] args) {
        int a = -15;
        int d = 0;
        System.out.print(a);

        for (int i = a+1; i <= 0; i++) {
            System.out.print(","+i);
            d ++;
        }
        System.out.println();
        System.out.println("Valor absoluto "+d);
    }
}
