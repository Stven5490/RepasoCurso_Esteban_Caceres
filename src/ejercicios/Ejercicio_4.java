package ejercicios;
/*
Crea un bucle FOR que inicie en 0 y llegue a 1000 con la condición de que si llega a
250 debe salir del bucle, el incremento debe ser de 10 en 10 y se debe imprimir
el resultado del conteo y además un mensaje que ha salido del bucle.
 */

public class Ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Inicio contador");
        for(int count=0; count<=10;count++){
            if(count==8) {
                break;
            }
            System.out.println("Count is ==> " + count);
        }
        System.out.println("Has salido del bucle");
    }
}
