package Ejercicios;

public class Ejercicio23 {
    public static void main(String[] args) {
        int a = 45;

        if(a % 2 == 0){
            System.out.println("Es divisible por 2");
        }
        if (a % 3 == 0){
            System.out.println("Es divisible por 3");
        }
        if (a % 5 == 0){
            System.out.println("es divisible por 5");
        }
        else {
            System.out.println("No es divisible por 2,3 y 5");
        }
    }
}
