package Clase;

public class Slide14 {
    public static void main(String[] args) {
        String fra,fr = "Es tan corto el amor y tan largo el olvido";
        int z = fr.indexOf(" ");
        fra = fr.substring(0, z);
        System.out.println("Primera palabra de la frase : \n\t\"" + fr + \"");
        System.out.println("es: ""+ fra +"\"");
    }
}
