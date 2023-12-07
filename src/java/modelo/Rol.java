package modelo;

import java.util.ArrayList;

public class Rol {
    public ArrayList<Rol> roles = new ArrayList<>();
    int id_rol;
    String rol;
    boolean estado;

    public Rol() {
    }

    public Rol(int id_rol, String rol, boolean estado) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.estado = estado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Rol> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Rol> roles) {
        this.roles = roles;
    }
    
    
}
