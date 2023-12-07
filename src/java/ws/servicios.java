
package ws;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Competencia;
import modelo.Rol;

/**
 *
 * @author luisd
 */
@WebService(serviceName = "servicios")
public class servicios {

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
}
