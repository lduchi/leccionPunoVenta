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
public class UsuarioRol {
    private Usuario id_usuario;
    private Rol id_rol;

    public UsuarioRol() {
    }

    public UsuarioRol(Usuario id_usuario, Rol id_rol) {
        this.id_usuario = id_usuario;
        this.id_rol = id_rol;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }
    
    
}
