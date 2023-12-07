/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Clasificacion;
import modelo.Competencia;
import modelo.Factura;
import modelo.ItemFactura;
import modelo.Persona;
import modelo.Producto;
import modelo.Proveedores;
import modelo.Rol;
import modelo.Tipo_Pago;
import modelo.Usuario;
import modelo.UsuarioRol;

@WebService(serviceName = "peticiones")
public class peticiones {

    List<Persona> listaPersonas = new ArrayList<>();
    List<Rol> listaRoles = new ArrayList<>();
    Rol rol = new Rol();
    ArrayList<Rol> rolesexistentes = rol.roles;
    List<Factura> listaFactura = new ArrayList<>();

    List<Tipo_Pago> listaTiposPago = new ArrayList<>();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "estadorol")
    public Boolean estadorol(@WebParam(name = "nombrerol") String nombrerol) {
        Rol rol = new Rol();

        ArrayList<Rol> estadospornombre = rol.getRoles();

        for (Rol rols : estadospornombre) {
            if (rols.getRol().equals(nombrerol)) {
                return rols.isEstado();
            }

        }
        return null;
    }

    @WebMethod(operationName = "siexisteComp")
    public Boolean siexisteComp(@WebParam(name = "idcomp") String idcomp) {
        Competencia competencia = new Competencia();

        ArrayList<Competencia> competenciasExistentes = competencia.getCompetencias();

        for (Competencia comps : competenciasExistentes) {
            if (comps.getCompetencias().equals(idcomp)) {
                return true;
            }

        }
        return false;
    }
    private ArrayList<UsuarioRol> bd_tabla_usuario_rol = new ArrayList<>();

    @WebMethod(operationName = "siexisterol")
    public Boolean siexisterol(@WebParam(name = "nombre") String nombre) {

        Rol rol2 = new Rol(1, "admin", true);
        Rol rol3 = new Rol(2, "cliente", true);
        Rol rol4 = new Rol(3, "empleado", true);
        Rol rol5 = new Rol(4, "vendedor", true);
        Rol rol6 = new Rol(5, "secretaria", true);
        rol.roles.add(rol2);
        rol.roles.add(rol3);
        rol.roles.add(rol4);
        rol.roles.add(rol5);
        rol.roles.add(rol6);

        for (Rol rols : rolesexistentes) {
            if (rols.getRol().equals(nombre)) {
                return true;
            }

        }
        return false;
    }

    @WebMethod(operationName = "registrarUsuarioPersonaRol")
    public String registrarUsuarioPersonaRol(
            @WebParam(name = "idUsuario") int idUsuario,
            @WebParam(name = "idPersona") int idPersona,
            @WebParam(name = "nombreUsuario") String nombreUsuario,
            @WebParam(name = "passwordUsuario") String passwordUsuario,
            @WebParam(name = "nombrePersona") String nombrePersona,
            @WebParam(name = "apellidoPersona") String apellidoPersona,
            @WebParam(name = "dniPersona") String dniPersona,
            @WebParam(name = "celularPersona") String celularPersona,
            @WebParam(name = "correoPersona") String correoPersona,
            @WebParam(name = "idRol") int idRol,
            @WebParam(name = "nombreRol") String nombreRol,
            @WebParam(name = "estadoRol") boolean estadoRol) {

        Persona nuevaPersona = new Persona(idPersona, nombrePersona, apellidoPersona, dniPersona, celularPersona, correoPersona);

        Rol nuevoRol = new Rol(idRol, nombreRol, estadoRol);

        Usuario nuevoUsuario = new Usuario(idUsuario, idPersona, nombreUsuario, passwordUsuario, nuevaPersona);

        if (nuevoUsuario.existeUsuario(nombreUsuario)) {
            return "El usuario ya existe. Por favor, elige otro nombre de usuario.";
        } else {

            nuevoUsuario.usuarios.add(nuevoUsuario);
            nuevaPersona.personas.add(nuevaPersona);
            nuevoRol.roles.add(nuevoRol);
            UsuarioRol usuariorol = new UsuarioRol(nuevoUsuario, nuevoRol);
            bd_tabla_usuario_rol.add(usuariorol);

            return "Registro exitoso: Usuario, Persona y Rol registrados correctamente.";
        }
    }

    @WebMethod(operationName = "registrarrol")
    public String registrarrol(
            @WebParam(name = "rolnombre") String rolnombre,
            @WebParam(name = "estado") boolean estado,
            @WebParam(name = "id") int id) {

        try {
            Rol rol = new Rol(id, rolnombre, estado);
            for (Rol rols : rolesexistentes) {
                if (rols.getId_rol() == id) {
                    return "El rol con el mismo ID ya existe. No se puede registrar.";
                }
            }

            rolesexistentes.add(rol);
            return "Éxito al registrar el rol";
        } catch (Exception e) {
            e.printStackTrace(); 
            return "Error al registrar el rol";
        }
    }

    @WebMethod(operationName = "loginUsuario")
    public String loginUsuario(
            @WebParam(name = "nombreUsuario") String nombreUsuario,
            @WebParam(name = "passwordUsuario") String passwordUsuario) {

        String rol = "";
        Usuario usuarioEncontrado = null;
        for (UsuarioRol usuario : bd_tabla_usuario_rol) {
            if (usuario.getId_usuario().getUser().equals(nombreUsuario) && usuario.getId_usuario().getPassword().equals(passwordUsuario)) {
                usuarioEncontrado = usuario.getId_usuario();
                rol = usuario.getId_rol().getRol();
                break;
            }
        }

        if (usuarioEncontrado != null) {
            String nombre = usuarioEncontrado.getPersona().getNombre();

            return "Login exitoso. Usuario: " + nombre + " y su rol es: " + rol;
        } else {
            return "Usuario o contraseña incorrectos. Por favor, verifica tus credenciales.";
        }
    }

    @WebMethod(operationName = "buscarP")
    public String buscarP(@WebParam(name = "dni") String dni) {
        for (Persona persona : listaPersonas) {
            if (dni.equals(persona.getDni())) {
                dni = persona.getDni();
                break;
            }
        }
        return dni;
    }

    @WebMethod(operationName = "nombreCompl")
    public String nombreCompl(@WebParam(name = "nombreCompleto") String nombreCompleto) {
        String nombre = null;
        for (Persona persona : listaPersonas) {
            if (nombreCompleto.equals(persona.getNombre() + persona.getApellido())) {
                nombre = persona.getNombre() + persona.getApellido();
                break;
            }
        }
        return nombre;
    }

    @WebMethod(operationName = "crearProducto")
    public boolean crearProducto(
            @WebParam(name = "idProducto") int idProducto,
            @WebParam(name = "stock") int stock,
            @WebParam(name = "precioUnitario") double precioUnitario,
            @WebParam(name = "unidad") String unidad,
            @WebParam(name = "idClasificacion") Clasificacion idClasificacion,
            @WebParam(name = "idProveedor") Proveedores idProveedor,
            @WebParam(name = "iva") boolean iva) {

        Producto nuevoProducto = new Producto(idProducto, stock, precioUnitario, unidad, idClasificacion, idProveedor, iva);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(nuevoProducto);

        return true;
    }

    @WebMethod(operationName = "crearFactura")
    public boolean crearFactura(
            @WebParam(name = "idFactura") int idFactura,
            @WebParam(name = "ruc") String ruc,
            @WebParam(name = "idPersona") int idPersona,
            @WebParam(name = "fecha") Date fecha,
            @WebParam(name = "idTipoPago") int idTipoPago,
            @WebParam(name = "descuento") double descuento,
            @WebParam(name = "total") double total,
            @WebParam(name = "items") List<ItemFactura> items) {

        Persona persona = obtenerPersonaPorId(idPersona);

        Tipo_Pago tipoPago = obtenerTipoPagoPorId(idTipoPago);

        Factura nuevaFactura = new Factura(idFactura, ruc, persona, fecha, tipoPago, descuento, total);

        nuevaFactura.setId_factura(idFactura);
        nuevaFactura.setId_persona(persona);
        nuevaFactura.setRuc(ruc);
        nuevaFactura.setFecha(fecha);
        nuevaFactura.setId_tipo_pago(tipoPago);
        nuevaFactura.setDescuento(descuento);
        nuevaFactura.setTotal(total);

        listaFactura.add(nuevaFactura);

        return true;
    }

    private Persona obtenerPersonaPorId(int idPersona) {
        for (Persona persona : listaPersonas) {
            if (persona.getId_persona() == idPersona) {
                return persona;
            }
        }
        return null;
    }

    private Tipo_Pago obtenerTipoPagoPorId(int idTipoPago) {
        for (Tipo_Pago tipoPago : listaTiposPago) {
            if (tipoPago.getId_tipo_pago() == idTipoPago) {
                return tipoPago;
            }
        }
        return null;
    }

}
