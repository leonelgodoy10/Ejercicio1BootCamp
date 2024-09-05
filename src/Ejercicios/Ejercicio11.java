package Ejercicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio11 {
    public static void main(String[] args) {
        int N = 10;
        int fib = 0, prev = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(fib + " ");
            int temp = fib;
            fib = fib + prev;
            prev = temp;
        }
    }
}
