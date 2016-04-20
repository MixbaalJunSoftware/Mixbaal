package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class EditarUsuario {

  private Usuario usuario;
  
  private String nombre;//Nombre de el usuario.
  private String app;//Apellido paterno del usuario.
  private String apm;//Apellido materno del usuario.
  private String password;//contrasenia del usuario.
  private String cpassword;//confirmacion de la contraseña
  private String telefono;//Teleffono del usuario.
  private String facultad;//Facultad del usuario. 
  private String msn;  
  
  
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }
    
    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }
    
    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFacultad() {
        return facultad;
    }
    
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getMsn() {
        return msn;
    }      

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
    
      
    public String editar() {
        if (this.password.equals(this.cpassword)){
        UsuarioDAO usr = new UsuarioDAO();
        this.usuario = new Usuario();
        try{
            usuario.setNombre(this.getNombre());
            usuario.setApp(this.getApm());
            usuario.setApm(this.getApm());
            usuario.setContrasenia(this.getPassword());
            usuario.setFacultad(this.getFacultad());
            usuario.setTelefono(this.getTelefono());
            usr.save(usuario);
            this.setMsn("Se actualizaron tus datos correctamente");
            return "perfilIH";    
            
        }catch(Exception e){
             this.setMsn("¡Ups! Ocurrió un error");
            return "EditarCuentaIH"; 
        }
        }
        else{
            this.setMsn("La contraseña no coincide");
            return "EditarCuentaIH";
        }
        
    }    
}