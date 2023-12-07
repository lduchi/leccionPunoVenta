/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Tipo_Pago {
    private Integer id_tipo_pago;
    private String tipo;
    private String descrip;

    public Tipo_Pago() {
    }

    public Tipo_Pago(Integer id_tipo_pago, String tipo, String descrip) {
        this.id_tipo_pago = id_tipo_pago;
        this.tipo = tipo;
        this.descrip = descrip;
    }

    public Integer getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(Integer id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
}
