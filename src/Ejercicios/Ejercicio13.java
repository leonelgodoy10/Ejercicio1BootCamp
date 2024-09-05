package Ejercicios;

public class Ejercicio13 {
    public static void main(String[] args) {
        String a = "1221";
        a = a.toLowerCase().replaceAll("\\s+", "");

        int inicio = 0;
        int fin = a.length() - 1;
        boolean esPalindromo = true;

        while (inicio < fin) {
            if (a.charAt(inicio) != a.charAt(fin)) {
                esPalindromo = false;
                break;
            }
            inicio++;
            fin--;
        }
        System.out.println(a + (esPalindromo ? " es" : " no es") + " un palíndromo.");
    }
}
