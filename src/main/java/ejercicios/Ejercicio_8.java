package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_8 {
    /*
    Crear una lista de 7 números enteros. Identificar el promedio de la lista.
     */

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(8);
        numeros.add(2);
        numeros.add(15);
        numeros.add(7);

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        double promedio = (double) suma / numeros.size();

        System.out.println("El promedio de la lisa es: " + promedio);
    }
}
