package Ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        String a = "54321";
        String d = "";

        for (int i = a.length()-1; i >= 0 ; i--) {
            d += String.valueOf((a.charAt(i)));
        }
        System.out.println("El numero invertido es : "+d);
    }
}
