package POO;

public class APP {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Producto prod1 = new Producto();

        p1.nombre = "Diego";
        p1.edad = 15;
        p1.dinero = 1000;

        prod1.nombre = "Papas Lays";
        prod1.stock = 10;
        prod1.precio = 800;
        prod1.descripcion = "Papas Lays corte americano 30 grms.";
    }
}
