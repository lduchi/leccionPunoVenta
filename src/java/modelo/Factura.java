/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Factura {
    private Integer id_factura;
    private String ruc;
    private Persona id_persona;
    private Date fecha;
    private Tipo_Pago id_tipo_pago;
    private Double descuento;
    private Double total;

    public Factura() {
    }

    public Factura(Integer id_factura, String ruc, Persona id_persona, Date fecha, Tipo_Pago id_tipo_pago, Double descuento, Double total) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.id_persona = id_persona;
        this.fecha = fecha;
        this.id_tipo_pago = id_tipo_pago;
        this.descuento = descuento;
        this.total = total;
    }

    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Persona getId_persona() {
        return id_persona;
    }

    public void setId_persona(Persona id_persona) {
        this.id_persona = id_persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tipo_Pago getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(Tipo_Pago id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "id_factura=" + id_factura + ", ruc=" + ruc + ", id_persona=" + id_persona + ", fecha=" + fecha + ", id_tipo_pago=" + id_tipo_pago + ", descuento=" + descuento + ", total=" + total + '}';
    }
    
    
    
}
