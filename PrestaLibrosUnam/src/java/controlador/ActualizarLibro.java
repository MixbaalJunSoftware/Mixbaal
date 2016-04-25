package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Libro;
import modelo.LibroDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;
import org.primefaces.event.FileUploadEvent;

@SessionScoped

public class ActualizarLibro implements Serializable{

    private Usuario usuario;
    private Libro libro;
    private String descripcion;
    private String foto;

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void actualizarLibro() {
        boolean modificado = false;
        
        LibroDAO ld = new LibroDAO();
        libro.setDescripcion(this.getDescripcion());
        libro.setFotoLibro(this.getFoto());
    }
    
    private final String destination= "/home/luis/NetBeansProjects/Mixbaal/PrestaLibrosUnam/web/public/imagenes/libros/";
    
    public void upload (FileUploadEvent event) {
      FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");
      FacesContext.getCurrentInstance().addMessage(null, msg);
      // Do what you want with the file
       try {
         copyFile(String.valueOf(usuario.getIdusuario()), event.getFile().getInputstream());
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
        UsuarioDAO ud = new UsuarioDAO();
        this.setFoto("/public/imagenes/" + fileName);
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