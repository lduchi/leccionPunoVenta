package modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Persona {
    public   ArrayList<Persona> personas=new ArrayList<>();
    private int id_persona;
    private String nombre;
    private String apellido;
    private String dni;
    private String celular;
    private String correo;

    public Persona(int id_persona, String nombre, String apellido, String dni, String celular, String correo) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.correo = correo;
    }

    public Persona() {
    }

    /**
     * @return the id_persona
     */
    public int getId_persona() {
        return id_persona;
    }

    /**
     * @param id_persona the id_persona to set
     */
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Persona buscarPorDni(String dni) {
        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                return persona;
            }
        }
        return null;
    }

    public ArrayList<String> buscarNombresPorDni(String dni) {
        ArrayList<String> nombresEncontrados = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                String nombreCompleto = persona.getNombre() + " " + persona.getApellido();
                nombresEncontrados.add(nombreCompleto);
            }
        }

        return nombresEncontrados.isEmpty() ? null : nombresEncontrados;
    }

}
