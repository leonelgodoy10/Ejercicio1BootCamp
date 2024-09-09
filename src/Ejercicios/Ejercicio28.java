package Ejercicios;

public class Ejercicio28 {
    public static void main(String[] args) {
        double a = 48;
        double b = 18;
        double r = a % b;;

        if (r == 0) {
            System.out.println("El maximo comun divisor es : "+b);
        }
        else {
            do {
                r = b % r;
                if (r !=0){
                    a = r;
                }
                if (r == 0) {
                    System.out.println("El maximo comun divisor es : "+a);
                }
            }while (r != 0);
        }
    }
}
