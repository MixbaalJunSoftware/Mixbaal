/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Libro;
import modelo.LibroDAO;
import modelo.Usuario;

@ManagedBean
@ViewScoped

/**
 *
 * @author danii
 */
public class MisLibros implements Serializable{
    
    private List<Libro> libros;
    private Usuario usuario;
    
    public List<Libro> getLibros() {
        return libros;
    }
    
    @PostConstruct
    public void misLibros() {
        LibroDAO lib = new LibroDAO();
        //libros = lib.findLibros(new Long (usuario.getIdusuario()));
        libros = lib.findLibros(new Long (0));
    }
    
}
