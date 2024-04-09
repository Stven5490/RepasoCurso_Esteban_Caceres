package ejercicios;

public class Ejercicio_3 {
    /*
    Crear un Array llamado Meses,
    este debe tener los 5 primeros meses del año.
    Imprimir por consola el segundo mes del año.
     */

    public static void main(String[] args) {

        String[] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo"};

        int iMeses = Meses.length;;

        for (int qMeses = 0; qMeses <= iMeses-1; qMeses++) {
            System.out.println(Meses[qMeses]);
        }
    }
}
