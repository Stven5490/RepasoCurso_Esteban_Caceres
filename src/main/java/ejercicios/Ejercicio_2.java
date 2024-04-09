package ejercicios;

public class Ejercicio_2 {
    /*
    Declara 2 variables numéricas (con el valor que desees),
    he indica cual es mayor de los dos. Si son iguales indicarlo también.
    Alterna los valores para comprobar que funcione.
     */

    public static void main(String[] args) {
        int v1;
        int v2;

        v1 = 5;
        v2 = 5;

        if (v1 > v2) {
            System.out.println(v1 + " es mayor que " + v2);
        } else if (v1 < v2) {
            System.out.println(v2 + " es mayor que " + v1);
        } else if (v1 == v2) {
            System.out.println(v1 + " es igual a "+ v2);

        }
    }
}
