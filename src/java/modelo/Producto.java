package modelo;

public class Producto {
    private int id_producto;
    private int stock;
    private double precio_unitario;
    private String unidad;
    private Clasificacion id_clasificacion;
    private Proveedores id_proveedor;
    private boolean iva;

    public Producto() {
    }

    public Producto(int id_producto, int stock, double precio_unitario, String unidad, Clasificacion id_clasificacion, Proveedores id_proveedor, boolean iva) {
        this.id_producto = id_producto;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
        this.id_clasificacion = id_clasificacion;
        this.id_proveedor = id_proveedor;
        this.iva = iva;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Clasificacion getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(Clasificacion id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public Proveedores getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedores id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }
//
}
