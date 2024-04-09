package ejercicios;

public class Ejercicio_11 {
    /*
    Generar los 10 primeros términos de la sucesión de Fibonacci.
    La sucesión de Fibonacci es 0,1,1,2,3,5,8,13,21,34,55…
     */

    public static void main(String[] args) {
        int n = 10;

        int primero = 0;
        int segundo = 1;

        System.out.println("Los primeros " + n + " términos de la sucesión de Fibonacci son:");

        System.out.print(primero + ", " + segundo + ", ");

        // Generar los siguientes términos
        for (int i = 2; i < n; i++) {
            int siguiente = primero + segundo;
            System.out.print(siguiente + ", ");
            primero = segundo;
            segundo = siguiente;
        }
    }
}
