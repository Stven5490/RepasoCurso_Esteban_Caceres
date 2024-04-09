package ejercicios;

public class Ejercicio_4 {
    /*
    Crea un bucle FOR que inicie en 0 y llegue a 1000 con la condición
    de que si llega a 250 debe salir del bucle, el incremento debe ser de
    10 en 10 y se debe imprimir el resultado del conteo y además un mensaje que
    ha salido del bucle.
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; ) {
            if (i < 250) {
                System.out.println(i);
                i++;
            } else {
                System.out.println(i);
                i += 10;
            }
        }
        System.out.println("ha salido del bucle");
    }
}
