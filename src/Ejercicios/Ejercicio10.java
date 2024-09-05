package Ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 6;
        int res = 1;

        for (int i = 1; i < a; i++) {
            res += i*res;
        }
        System.out.println(res);
    }
}
