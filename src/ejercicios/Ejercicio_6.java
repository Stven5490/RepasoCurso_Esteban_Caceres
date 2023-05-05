package ejercicios;
//Calcular la suma de los 100 primeros números positivos. (1+2+3+4+5…+100).
public class Ejercicio_6 {
    public static void main(String[] args) {
        for(int suma = 1; suma <= 100; suma+=1){
            if (suma > 100){
                break;
            }
            System.out.println("Suma:"+ suma);
        }
    }
}
