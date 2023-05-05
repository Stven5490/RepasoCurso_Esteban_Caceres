package ejercicios;
/*Generar los 8 primeros términos de la sucesión de Fibonacci.
 La sucesión de Fibonacci es 0,1,1,2,3,5,8,13,21,34,55…
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        int valor = 10, n1 = 0, n2 = 1, n3 = 1;
        System.out.println(n1);
        for (int i = 1; i < valor; i++){
            System.out.println(n3);
            valor = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
