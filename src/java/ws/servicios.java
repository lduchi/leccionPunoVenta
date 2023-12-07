
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Competencia;
import modelo.Persona;
import modelo.Producto;
import modelo.Rol;
import modelo.Usuario;

/**
 *
 * @author luisd
 */
@WebService(serviceName = "servicios")
public class servicios {

    //private final AES_ENCRYPTOR ac = new AES_ENCRYPTOR();

    List<Persona> listaPersonas = new ArrayList<>();
    List<Rol> listaRoles = new ArrayList<>();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "siexisterol")
    public Boolean siexisterol(@WebParam(name = "nombre") String nombre) {
        Rol rol = new Rol();
        
        ArrayList<Rol> rolesexistentes = rol.getRoles();
        
        for (Rol rols: rolesexistentes) {
            if (rols.getRol().equals(nombre)) {
                return true;
            }
            
        }
        return false;
    }

    
    
    
    @WebMethod(operationName = "estadorol")
    public Boolean estadorol(@WebParam(name = "nombrerol") String nombrerol) {
        Rol rol = new Rol();
        
        ArrayList<Rol> estadospornombre = rol.getRoles();
        
        for (Rol rols: estadospornombre) {
            if (rols.getRol().equals(nombrerol)) {
                return rols.isEstado();
            }
            
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public Boolean operation(@WebParam(name = "nombre") String nombre) {
        Competencia compe =  new Competencia();
        ArrayList<Competencia> competenciaexiste = compe.getCompetencias();
        
        return null;
    }
    
    @WebMethod(operationName = "buscarP")
    public String buscarP(@WebParam(name = "dni") String dni) {
        for (Persona persona : listaPersonas) {
            if (dni.equals(persona.getDni())) {
                dni=persona.getDni();
                break;
            }
        }
        return dni;
    }

    @WebMethod(operationName = "nombreCompl")
    public String nombreCompl(@WebParam(name = "nombreCompleto") String nombreCompleto) {
        String nombre = null;
        for (Persona persona : listaPersonas) {
            if (nombreCompleto.equals(persona.getNombre()+persona.getApellido())) {
                nombre = persona.getNombre()+persona.getApellido();
                break;
            }
        }
        return nombre;
    }

}
