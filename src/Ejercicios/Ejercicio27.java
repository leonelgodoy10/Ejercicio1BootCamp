package Ejercicios;

public class Ejercicio27 {
    public static void main(String[] args) {
        int a = 5 , b = 10 ;

        System.out.println("El valor de A: "+ a+ " - El valor de B: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("El valor de A: "+ a +" - El valor de B: "+b);
    }
}
