package Ejercicios;

public class Ejercicio19 {
    public static void main(String[] args) {
        int a = 28;
        int sum = 0;
        System.out.println("Sus divisores son :");
        for (int i = 1; i < a; i++) {
            if (a  % i == 0) {
                System.out.print(","+i);
                sum += i;
            }
        }
        System.out.println();
        if (a == sum) {
            System.out.println("El numero "+a+" es un numero perfecto ");
            System.out.println("Ya que la suma de sus divisores es : "+sum);
        }
        else {
            System.out.println("No es un numero perfecto");
            System.out.println("Ya que la suma de sus divisores es :"+sum);
        }

    }
}
