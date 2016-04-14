package controlador;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import modelo.Usuario;
import modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@ManagedBean
/**
 *
 * @author jonathanjb
 */
public class Registrar {

    public Usuario usuario;
  
    private String nombe;//Nombre de el usuario.
    private String app;//Apellido paterno del usuario.
    private String apm;//Apellido materno del usuario.
    private String password;//contrasenia del usuario.
    private int telefono;//Teleffono del usuario.
    private String facultad;//Facultad del usuario. 
    private String correo;//Correo del usuario.
    /**
     * 
     * @return  el correo del usuario
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * 
     * @param correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * 
     * @return el nombre el del usuario 
     */
    public String getNombe() {
        return nombe;
    }
    /**
     * 
     * @param nombre el nombre el del usuario 
     */
    public void setNombe(String nombre) {
        this.nombe = nombre;
    }
    /**
     * 
     * @return El Apellido paterno del usuario
     */
    public String getApp() {
        return app;
    }
    /**
     * 
     * @param app. El Apellido paterno del usuario
     */
    public void setApp(String app) {
        this.app = app;
    }
    /**
     * 
     * @return El apellido materno del usuario
     */
    public String getApm() {
        return apm;
    }
    /**
     * 
     * @param apm. El apellido paterno de el usuario
     */
    public void setApm(String apm) {
        this.apm = apm;
    }
    /**
     * 
     * @return La contrasenia del usuario 
     */
    public String getPassword() {
        return password;
    }
    /**
     * 
     * @param password La contrasenia del usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @return el telefono del usuario 
     */
    public int getTelefono() {
        return telefono;
    }
    /**
     * 
     * @param telefono el telefono de el usuario. 
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    /**
     * 
     * @return La facultad de el usuario
     */
    public String getFacultad() {
        return facultad;
    }
    /**
     * 
     * @param facultad la Facultad de el usuario. 
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
  public void Registrar() {
        usuario = new Usuario();
        UsuarioDAO user = new UsuarioDAO();
        try{
             usuario.setNombre(this.getNombe());
             usuario.setApp(this.getApp());
             usuario.setApm(this.getApm());
             usuario.setContrasenia(this.getPassword());
             usuario.setFacultad(this.getFacultad());
             usuario.setFacultad(this.getFacultad());
             usuario.setCorreo(this.getCorreo());
             //usuario.setFotoUsr();
             usuario.setIdusuario(user.maxIndice());
             user.save(usuario);
        }catch(Exception e){
        }
  }
  
  
}