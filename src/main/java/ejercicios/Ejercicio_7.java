package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_7 {
    /*
    Crear una lista de 7 números enteros. Identificar el número menor de la lista.
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

        int menor = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }

        System.out.println("El numero menor de la lista es: " + menor);
    }
}
