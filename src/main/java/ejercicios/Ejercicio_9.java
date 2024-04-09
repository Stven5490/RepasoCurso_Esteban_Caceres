package ejercicios;

public class Ejercicio_9 {

    /*
    Crear una variable de nombre “sueldoBruto” e inicialícela con el valor 1000000. Imprimir por consola:

        a. Sueldo bruto
        b. Descuento afp (7% del sueldo bruto)
        c. Descuento salud (10% del sueldo bruto)
        d. Descuento bono cesantía (1% del sueldo bruto)
        e. Sueldo liquido (sueldo bruto – descuentos)
     */

    public static void main(String[] args) {
        int sueldoBruto;
        int AFP;
        double pctAFP;
        int desctoAFP;
        String valorAFP;
        int Salud;
        double pctSALUD;
        int desctoSalud;
        String valorSalud;
        int Cesantia;
        double pctCESANTIA;
        int desctoCesantia;
        String valorCesantia;
        int totalDescto;
        int sueldoLiquido;

        sueldoBruto = 1000000;
        System.out.println("Sueldo bruto: " + sueldoBruto);

        AFP = 7;
        pctAFP = ((double) AFP / 100);
        desctoAFP = (int) (sueldoBruto * pctAFP);
        valorAFP = AFP + "%";
        System.out.println("Valor a descontar por AFP " + valorAFP + ": " + desctoAFP);

        Salud = 10;
        pctSALUD = ((double) Salud / 100);
        desctoSalud = (int) (sueldoBruto * pctSALUD);
        valorSalud = Salud + "%";
        System.out.println("Valor a descontar por Salud " + valorSalud + ": " + desctoSalud);

        Cesantia = 1;
        pctCESANTIA = ((double) Cesantia / 100);
        desctoCesantia = (int) (sueldoBruto * pctCESANTIA);
        valorCesantia = Cesantia + "%";
        System.out.println("Valor a descontar por bono cesantia " + valorCesantia + ": " + desctoCesantia);

        totalDescto = desctoAFP + desctoSalud + desctoCesantia;
        System.out.println("Valor total de descuento : " + totalDescto);

        sueldoLiquido = sueldoBruto - totalDescto;
        System.out.println("Sueldo liquido: " + sueldoLiquido);
    }
}
