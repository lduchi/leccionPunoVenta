package modelo;

import java.util.ArrayList;

public class Competencia {
    ArrayList<Competencia>competencias = new ArrayList<>();
    
    int id_competencia;
    String nombre;
    boolean Estado;

    public Competencia() {
    }

    public Competencia(int id_competencia, String nombre, boolean Estado) {
        this.id_competencia = id_competencia;
        this.nombre = nombre;
        this.Estado = Estado;
    }

    public ArrayList<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(ArrayList<Competencia> competencias) {
        this.competencias = competencias;
    }

    public int getId_competencia() {
        return id_competencia;
    }

    public void setId_competencia(int id_competencia) {
        this.id_competencia = id_competencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
}
