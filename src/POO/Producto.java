package POO;

public class Producto {
    private String nombre;
    int precio;
    String descripcion;
    Marca marca;

    public void disminuirStockEn1(){
        stock = stock -1;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String, nombre){
        this.nombre = nombre;
    }
}
