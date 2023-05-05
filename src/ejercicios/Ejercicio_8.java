package ejercicios;
//Crear una lista de 7 números enteros. Identificar el promedio de la lista.
public class Ejercicio_8 {
    public static void main(String[] args) {
        double[] valores = new double[]{7, 7, 7, 7, 7, 7, 7};
        double promedio = 0;
        for (int i = 0; i < valores.length; i++){
            promedio += valores[i];
        }
        System.out.println("El promedio de la lista es:" + (promedio/valores.length));
    }
}
