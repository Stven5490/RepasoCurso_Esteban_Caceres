package ejercicios;

public class Ejercicio_5 {
    /*
    Crea 1 variable llamada nota y desarrolla el siguiente flujo:
        ¿La nota es mayor o igual a 4?
            R.- No => Imprime "Reprobado"
            R.- Si => Imprime "Aprobado"
            R.- ¿La nota es un 7? => Imprime "Felicitaciones con nota 7"
     */
    public static void main(String[] args) {
        int nota;
        nota = 5;

        if (nota == 7) {
            System.out.println("Felicitaciones con nota 7");
        } else if (nota >= 4) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
