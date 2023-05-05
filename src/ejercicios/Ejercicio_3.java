package ejercicios;
/*
Crear un Array llamado Meses,
este debe tener los 5 primeros meses del año.
Imprimir por consola el segundo mes del año.
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        String[] Meses ={"Enero", "Febrero", "Marzo", "Abril", "Mayo"};

        int iLenght = Meses.length;
        String sEnero = Meses[0];
        String sFebrero = Meses[1];
        String sMarzo = Meses[2];
        String sAbril = Meses[3];
        String sMayo = Meses[4];

        int mes_indicado = 12;
        if(mes_indicado <= 4)
        {
            System.out.println("El mes indicado segun tarea es:" + Meses[mes_indicado]);
        }
        else
        {
            System.out.println("No existe el mes indicado");
        }
    }
}
