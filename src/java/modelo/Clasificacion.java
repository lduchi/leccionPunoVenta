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
public class Clasificacion {
    private int id_clasificacion;
    private String grupo;

    /**
     * @return the id_clasificacion
     */
    public int getId_clasificacion() {
        return id_clasificacion;
    }

    /**
     * @param id_clasificacion the id_clasificacion to set
     */
    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Clasificacion() {
    }

    public Clasificacion(int id_clasificacion, String grupo) {
        this.id_clasificacion = id_clasificacion;
        this.grupo = grupo;
    }
    
}
