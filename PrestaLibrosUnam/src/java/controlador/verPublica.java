package controlador;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedProperty;
import modelo.Libro;
import modelo.LibroDAO;
import modelo.Usuario;

@ManagedBean
@ViewScoped

public class verPublica implements Serializable {

    private List<Libro> libros;
    private Usuario usuario;
       
    @PostConstruct
    public void ver() {
        LibroDAO lib = new LibroDAO();
        libros = lib.findAll();
    }
 
    public List<Libro> getLibros() {
        return libros;
    }
    
    public String verUsuario(){
        return usuario.getFotoUsr();
    }
 
}
