package ejercicios;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int sueldoBruto = 1000000;;
        float descto_afp = 7;
        float AFP = (descto_afp/100) * sueldoBruto;
        float descto_salud = 10;
        float SALUD = (descto_salud/100) * sueldoBruto;
        float descto_cesantia = 1;
        float AFC = (descto_cesantia/100) * sueldoBruto;
        float sueldoLiquido;
        sueldoLiquido = sueldoBruto-(AFP+SALUD+AFC);

        System.out.println("Sueldo Bruto:" + sueldoBruto);
        System.out.println("Descuento AFP:" +AFP);
        System.out.println("Descuento Salud:" + SALUD);
        System.out.println("Descuento Cesantia:"+AFC);
        System.out.println("Sueldo Liquido:" + sueldoLiquido);
    }
}
