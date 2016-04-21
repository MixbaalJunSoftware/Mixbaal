package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;

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
    private String telefono;//Teleffono del usuario.
    private String facultad;//Facultad del usuario. 
    private String correo;//Correo del usuario.
    private String msn;    
    
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
     * @return  un mensage
     */
    public String getMsn() {
        return msn;
    }
    /**
     * 
     * @param msn 
     */
    public void setMsn(String msn) {
        this.msn = msn;
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
    public String getTelefono() {
        return telefono;
    }
    /**
     * 
     * @param telefono el telefono de el usuario. 
     */
    public void setTelefono(String telefono) {
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
    
  public void registraU() {
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
             usuario.setFotoUsr("/PrestaLibrosUnam/public/imagenes/usuario.png");
             //usuario.setIdusuario(user.maxIndice());
             usuario.setTelefono(this.getTelefono());
             user.save(usuario);
             System.out.printf("Todo Bien");
             this.setMsn("todo Bien");
        }catch(Exception e){
            this.setMsn("Algo Fallo");
            System.out.printf("Algo fallo");
        }
  }
  
  
}