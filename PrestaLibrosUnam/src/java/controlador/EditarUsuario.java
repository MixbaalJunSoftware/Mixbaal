package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@RequestScoped

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
    
    public void listener(ActionEvent event){
	usuario = (Usuario)event.getComponent().getAttributes().get("usuario");
    }
   
    
      
    public String editar() {
        UsuarioDAO usr = new UsuarioDAO();
        if (this.getPassword() != null&&!this.getPassword().equals("")){  
            if(this.getPassword().equals(this.getCpassword())){
                usuario.setContrasenia(this.getPassword());
                modificado = true;
            }
            else{
                this.setMsn("La contraseña no coincide");
                return "EditarCuentaIH";
            }
        }
        else if(this.getTelefono()!= null&&!this.getTelefono().equals("")){
                usuario.setTelefono(this.getTelefono());
                modificado = true;
        }
        else if (this.getFacultad()!=null&&!this.getFacultad().equals("")){
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
            System.out.print("algo salio mal");
             this.setMsn("¡Ups! Ocurrió un error");
            return "EditarCuentaIH"; 
        }
        }
        else {
            this.setMsn("No hay ningun dato para modificar");
            System.out.print("no se edito nada");
            return "EditarCuentaIH";
        }
    }
    
    private final String destination= "../Web Pages/public/imagenes/";
    
    public void upload (FileUploadEvent event) {
      FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");
      FacesContext.getCurrentInstance().addMessage(null, msg);
      // Do what you want with the file
       try {
         copyFile("dos" , event.getFile().getInputstream());
       } catch (IOException e) {
         FacesMessage msg2 = new FacesMessage("Is NOT Succesful", event.getFile().getFileName() + " is not uploaded.");
         FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    
    public void copyFile(String fileName, InputStream in) {
       try {
         OutputStream out = new FileOutputStream(new File(destination + fileName));
         int read = 0; 
         byte[] bytes = new byte[1024]; 
         while ((read = in.read(bytes)) != -1) {
        out.write(bytes, 0, read);
      }
      in.close();
      out.flush();
      out.close();
      System.out.println("New file created!");
      } catch (IOException e) {
         System.out.println(e.getMessage());
      }
    }    
}
