package POO;

public class Persona {
    int edad;
    String nombre;
    int dinero;

    public String comprar(Producto producto){
        if(producto.stock==0){
            return "No hay stock";
        }
        if(dinero>=producto.precio){
            dinero = dinero - producto.precio;
            producto.disminuirStockEn1();
            return "Se realiza la compra correctamente";
        }else{
            return "El saldo no es suficiente para la compra";
        }
    }
}
