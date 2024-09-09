package Ejercicios;

public class Ejercicio20 {
    public static void main(String[] args) {
        int a = 153;
        String s = String.valueOf(a);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += (int) Math.pow(Character.getNumericValue(s.charAt(i)),s.length());
            System.out.print("+"+(int) Math.pow(Character.getNumericValue(s.charAt(i)),s.length()));
        }
        if (sum == a) {
            System.out.println(" = "+sum);
            System.out.println("El número "+a+" Es un Número Armstrong");
        }
        else {
            System.out.println(" = "+sum);
            System.out.println("El número "+a+" No es un Número Armstrong");
        }
    }
}
