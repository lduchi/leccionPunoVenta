package modelo;

import java.util.ArrayList;

public class Usuario {
    private int id_usuario;
    private int id_persona;
    private String user;
    private String password;
    private Persona persona;
    public ArrayList<Usuario> usuarios= new ArrayList<>();

    public Usuario(int id_usuario, int id_persona, String user, String password, Persona persona) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.user = user;
        this.password = password;
        this.persona = persona;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
     public boolean existeUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equals(username)) {
                return true;
            }
        }
        return false; 
    }
    
    
}