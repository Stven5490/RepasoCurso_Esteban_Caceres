package ejercicios;
/*
Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
Si son iguales indicarlo también. Alterna los valores para comprobar que funcione.
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        int numero1 = 45;
        int numero2 = 30;
        if (numero1 > numero2){
            System.out.println("numero1 es mayor que numero 2");
        }
        else if (numero1 == numero2){
            System.out.println(numero1 + " es igual que " + numero2);
        }
        else{
            System.out.println("numero2 es mayor que numero 1");
        }


    }

}
