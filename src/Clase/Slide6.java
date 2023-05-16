package Clase;

public class Slide6 {
    public static void main(String[] args) {
        String te1 = "Hola";
        String te2 = "hola";

        if(te1.compareToIgnoreCase(te2) == 0)
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");

        String  a = "gato", b = "perro", c = "GATO";
        int z = a.compareTo(b);
        int p = b.compareTo(a);
        int q = a.compareToIgnoreCase(c);
    }
}
