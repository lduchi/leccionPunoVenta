
package modelo;

public class ItemFactura {
    
    
    private int id_item_factura;
    private Factura id_fcatura;
    private Producto id_producto;
    private int cantidad;
    private double precio;
    private double subtotal;

    public ItemFactura() {
    }

    public ItemFactura(int id_item_factura, Factura id_fcatura, Producto id_producto, int cantidad, double precio, double subtotal) {
        this.id_item_factura = id_item_factura;
        this.id_fcatura = id_fcatura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public int getId_item_factura() {
        return id_item_factura;
    }

    public void setId_item_factura(int id_item_factura) {
        this.id_item_factura = id_item_factura;
    }

    public Factura getId_fcatura() {
        return id_fcatura;
    }

    public void setId_fcatura(Factura id_fcatura) {
        this.id_fcatura = id_fcatura;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

//re
}
