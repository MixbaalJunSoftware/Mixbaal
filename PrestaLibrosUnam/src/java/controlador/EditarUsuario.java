package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

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
  private boolean modificado;
  
  
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
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public void setUsuario(Usuario usr){
        this.usuario=usr;
    }
    
      
    public String editar() {
        UsuarioDAO usr = new UsuarioDAO();
        if (!this.password.equals("")&&this.password != null){  
            if(this.password.equals(this.cpassword)){
                usuario.setContrasenia(this.getPassword());
                modificado = true;
            }
            else{
                this.setMsn("La contraseña no coincide");
                return "EditarCuentaIH";
            }
        }
        else if(!this.telefono.equals("")&&this.telefono!= null){
                usuario.setTelefono(this.getTelefono());
                modificado = true;
        }
        else if (!this.getFacultad().equals("")&& this.getFacultad()!=null){
               usuario.setFacultad(this.getFacultad());
               modificado = true;
        }
        if (modificado){
            try{   
            usr.update(usuario);
            System.out.print("se actualizo el usuario");
            this.setMsn("Se actualizaron tus datos correctamente");
            return "perfilIH";    
            
        }catch(Exception e){
             this.setMsn("¡Ups! Ocurrió un error");
            return "EditarCuentaIH"; 
        }
        }
        else {
            this.setMsn("No hay ningun dato para modificar");
            return "EditarCuentaIH";
        }
    }
}
