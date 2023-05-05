package ejercicios;
//Crear una lista de 7 números enteros. Identificar el número menor de la lista.
public class Ejercicio_7 {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7};
        int menor = numeros[0];
        for (int x = 0; x < numeros.length; x++){
            if(numeros[x] < menor){
                menor = numeros[x];
            }
        }
        System.out.println("El numero menor es:" + menor);
    }
}
