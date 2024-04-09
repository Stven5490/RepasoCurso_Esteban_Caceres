package ejercicios;

public class Ejercicio_6 {
    /*
    Calcular la suma de los 100 primeros números positivos. (1+2+3+4+5…+100)
     */

    public static void main(String[] args) {
        int count = 0;
        do {
            count = count +(count + 1);
            System.out.println(count);
        } while (count < 100);
    }
}
