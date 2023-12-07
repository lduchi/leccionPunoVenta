package modelo;

import java.util.ArrayList;

public class CompetenciaRol {
    Rol rol;
    Competencia competencia;

    public CompetenciaRol() {
    }

    public CompetenciaRol(Rol rol, Competencia competencia) {
        this.rol = rol;
        this.competencia = competencia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    
    
    
}
