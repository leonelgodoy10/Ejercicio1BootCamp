package Ejercicios;

public class Ejercicio20 {
    public static void main(String[] args) {
        int a = 153;
        String numeroString = Integer.toString(a);
        char[] digitos = numeroString.toCharArray();
        int[] potencias = new int[digitos.length];
        int sum = 0;

        for (int i = 0; i < digitos.length; i++) {
            int digito = Character.getNumericValue(digitos[i]);
            potencias[i] = (int) Math.pow(digito,digitos.length);
            System.out.println("Dígito: " + digito + ", Potencia: " + (i + 1) + ", Resultado: " + potencias[i]);
            sum += potencias[i];
        }
        System.out.println("la suma de las potencias es : "+sum);

        if (sum == a) {
            System.out.println("El numero "+a+" si es un Número Armstrong");
        }
        else {
            System.out.println("El numero "+a+" no es un Número Armstrong");
        }
    }
}
