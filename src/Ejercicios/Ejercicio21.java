package Ejercicios;

public class Ejercicio21 {
    public static void main(String[] args) {
        //calcula raiz cuadrada hasta el 81
        int a = 49;

        for (int i = 1; i < 10; i++) {
            if (i*i == a) {
                System.out.println("La raiz cuadrada de "+a+" es "+i);
                break;
            }
        }



    }
}
