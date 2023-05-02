package ejercicios;
/*
Crea 1 variable llamada nota y desarrolla el siguiente flujo:
Consultar nota:
    ¿La nota es un 7?
        Si: Imprime "Felicitaciones Aprobado con nota 7"
        No: ¿La Nota es mayor a 4?
            Si: Imprime "Aprobado"
            No: Imprime "Reprobado"
 */

public class Ejercicio_5 {
    public static void main(String[] args) {
        int nota = 4;
        if (nota == 7){
            System.out.println("Felicitaciones Aprobado con nota 7");
        } else if (nota >= 4) {
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Reprobado");
        }
    }

}
